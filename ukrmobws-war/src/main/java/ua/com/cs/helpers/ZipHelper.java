package ua.com.cs.helpers;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.zip.*;

/**
 * Created by valeriy_solyanik
 * on 15.12.2015.
 */
public class ZipHelper {

	/**
	 * Кодировка данных с которыми будет работать класс
	 */
	private String encoding;

	public ZipHelper(String encoding) {
		this.encoding = encoding;
	}

	/**
	 * Сжатие одной строки, с присвоением имени
	 *
	 * @param s         String - строка на сжатие
	 * @param entryName String - имя части
	 * @return byte[] - сжатые данные в виде массива байт
	 * @throws java.io.IOException исключение при сжатии
	 */
	public byte[] CompressOneEntry(String s, String entryName) throws IOException {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ZipOutputStream zip = new ZipOutputStream(bos);
		zip.setMethod(ZipEntry.DEFLATED);
		zip.setLevel(Deflater.BEST_COMPRESSION);
		zip.putNextEntry(new ZipEntry(entryName));
		Writer w = new OutputStreamWriter(zip, encoding);
		w.write(s);
		w.flush();
		zip.finish();
		w.close();
		return bos.toByteArray();
	}

	/**
	 * Сжатие данных в формате GZIP
	 *
	 * @param s String - данные для сжатия
	 * @return byte[] - сжатые данные в виде массива байт
	 * @throws IOException исключение при выполнении операции
	 */
	public byte[] CompressGZIP(String s) throws IOException {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		GZIPOutputStream zip = new GZIPOutputStream(bos);
		Writer w = new OutputStreamWriter(zip, encoding);
		w.write(s);
		w.flush();
		zip.finish();
		w.close();
		return bos.toByteArray();
	}

	/**
	 * Сжатие произвольного количества данных
	 *
	 * @param entries HashMap - массив данных для сжатия
	 * @return byte[] - сжатые данные в виде массива байт
	 * @throws IOException исключение при выполнении операций
	 */
	public byte[] Compress(HashMap entries) throws IOException {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ZipOutputStream zip = new ZipOutputStream(bos);
		zip.setMethod(ZipEntry.DEFLATED);
		zip.setLevel(Deflater.BEST_COMPRESSION);
		Iterator iter = entries.keySet().iterator();
		while (iter.hasNext()) {
			String sEntryName = (String) iter.next();
			byte[] baEntryData = (byte[]) entries.get(sEntryName);
			zip.putNextEntry(new ZipEntry(sEntryName));
			zip.write(baEntryData, 0, baEntryData.length);
			zip.closeEntry();
		}
		zip.finish();

		return bos.toByteArray();
	}

	/**
	 * Распаковка одной строки данных
	 *
	 * @param data byte[]- данные для распаковки в виде массива байт
	 * @return String - распакованная строка
	 * @throws IOException исключение при выполнении операции
	 */
	public String DecompressOneEntry(byte[] data) throws IOException {
		ZipInputStream zip = new ZipInputStream(new ByteArrayInputStream(data));
		zip.getNextEntry();

		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		int iOneByte = 0;
		while (zip.available() == 1) {
			iOneByte = zip.read();
			if (iOneByte != -1) {
				baos.write(iOneByte);
			}
		}
		baos.close();

		zip.closeEntry();
		return new String(baos.toByteArray(), encoding);
	}

	/**
	 * Распаковка данных в формате GZIP
	 *
	 * @param data byte[] - данные для распаковки в виде массива байт
	 * @return String - распакованная строка
	 * @throws IOException исключение при выполнении операции
	 */
	public String DecompressGZIP(byte[] data) throws IOException {
		GZIPInputStream zip = new GZIPInputStream(new ByteArrayInputStream(data));
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		int iOneByte = 0;
		while (zip.available() == 1) {
			iOneByte = zip.read();
			if (iOneByte != -1) {
				baos.write(iOneByte);
			}
		}
		baos.close();
		return new String(baos.toByteArray(), encoding);
	}

	/**
	 * Распаковка архива с множественными данными
	 *
	 * @param data byte[] - данные для распаковки в виде массива байт
	 * @return HashMap - распакованные данные в массиве по именам
	 * @throws IOException исключение при выполнении операции
	 */
	public HashMap Decompress(byte[] data) throws IOException {
		HashMap hmResult = new HashMap();
		ZipInputStream zip = new ZipInputStream(new ByteArrayInputStream(data));
		ZipEntry entry = null;
		while ((entry = zip.getNextEntry()) != null) {
			String sName = entry.getName();
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			while (zip.available() == 1) {
				baos.write(zip.read());
			}
			byte[] bytes = baos.toByteArray();
			hmResult.put(sName, bytes);
			zip.closeEntry();
		}
		return hmResult;
	}

}