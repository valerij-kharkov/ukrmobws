package ua.com.cs;

import ua.com.cs.helpers.Base64;
import ua.com.cs.helpers.XMLAndMarshallerHelper;
import ua.com.cs.helpers.ZipHelper;
import ua.com.cs.model.ifobswm.WMServiceBean;
import ua.com.cs.model.ifobswm.WMServiceBeanService;

/**
 * Created by valeriy_solyanik
 * on 14.12.2015.
 */
public class Main {
	public static void main(String[] args) throws Exception {
		//WMServiceBeanService service = new WMServiceBeanService();
		//WMServiceBean wmServiceBean = service.getWMServiceBeanPort();
		String message = "<Response>\n" +
				"  <SenderInfo>\n" +
				"    <SessionInfo id=\"123429\"/>\n" +
				"  </SenderInfo>\n" +
				"  <StatusBlock>\n" +
				"    <Status>OK</Status>\n" +
				"  </StatusBlock>\n" +
				"  <Parameters>\n" +
				"    <FirstTxId>2</FirstTxId>\n" +
				"    <LastTxId>52</LastTxId>\n" +
				"    <CanContinue>false</CanContinue>\n" +
				"    <TxCount>23</TxCount>\n" +
				"    <AccountDetails>\n" +
				"      <Balances>\n" +
				"        <Ledger>0.00</Ledger>\n" +
				"        <Available/>\n" +
				"        <ProjectedLedger>0.00</ProjectedLedger>\n" +
				"        <OverdraftLimit>0.00</OverdraftLimit>\n" +
				"        <Moved/>\n" +
				"        <ActualizedTime/>\n" +
				"      </Balances>\n" +
				"      <Type>CARD</Type>\n" +
				"      <OwnerName>МАЛІНІН ІГОР</OwnerName>\n" +
				"      <OwnerAddress/>\n" +
				"      <Status/>\n" +
				"      <Access/>\n" +
				"      <TxId>2</TxId>\n" +
				"      <Currency>EUR</Currency>\n" +
				"      <BranchId>300528</BranchId>\n" +
				"      <AccountName/>\n" +
				"      <Card>\n" +
				"        <EndDate>30-04-2018</EndDate>\n" +
				"        <CardAccount>26258080784446</CardAccount>\n" +
				"        <AccountId>119</AccountId>\n" +
				"        <CardNo>533194******1609</CardNo>\n" +
				"        <Contract/>\n" +
				"        <EmbossedName>IGOR MALININ</EmbossedName>\n" +
				"        <State>ACTIVE</State>\n" +
				"        <ContractId>46</ContractId>\n" +
				"        <IsPrimary>true</IsPrimary>\n" +
				"        <Type>MasterCard World</Type>\n" +
				"        <CurrencyCode>978</CurrencyCode>\n" +
				"        <Alarmed>0</Alarmed>\n" +
				"        <OwnerIdentifyCode/>\n" +
				"        <BranchDesc>АТ \"ОТП Банк\"</BranchDesc>\n" +
				"        <CardName/>\n" +
				"        <TempLimitId/>\n" +
				"        <TempLimitFrom/>\n" +
				"        <TempLimitTill/>\n" +
				"        <TempLimitName/>\n" +
				"        <MainLimitName>MC Reword EUR</MainLimitName>\n" +
				"        <SavingAccountNo/>\n" +
				"        <CardId>7F8311E8C4B6C557B28668C41495F5E7</CardId>\n" +
				"        <CardStateId>0</CardStateId>\n" +
				"        <SoftStopList>0</SoftStopList>\n" +
				"        <ResponseId/>\n" +
				"        <SwitchStatus>CANBLOCKCARD</SwitchStatus>\n" +
				"        <ShowCard>true</ShowCard>\n" +
				"        <PictureVersion>104</PictureVersion>\n" +
				"        <CanUnblock/>\n" +
				"        <ContractNumber>66</ContractNumber>\n" +
				"        <EnrolledDate>11-03-2014</EnrolledDate>\n" +
				"        <DisplayOrder>0</DisplayOrder>\n" +
				"      </Card>\n" +
				"    </AccountDetails>\n" +
				"    <AccountDetails>\n" +
				"      <Balances>\n" +
				"        <Ledger>43067.35</Ledger>\n" +
				"        <Available/>\n" +
				"        <ProjectedLedger>0.00</ProjectedLedger>\n" +
				"        <OverdraftLimit>0.00</OverdraftLimit>\n" +
				"        <Moved/>\n" +
				"        <ActualizedTime/>\n" +
				"      </Balances>\n" +
				"      <Type>CARD</Type>\n" +
				"      <OwnerName>МАЛІНІН ІГОР</OwnerName>\n" +
				"      <OwnerAddress/>\n" +
				"      <Status/>\n" +
				"      <Access/>\n" +
				"      <TxId>5</TxId>\n" +
				"      <Currency>UAH</Currency>\n" +
				"      <BranchId>300528</BranchId>\n" +
				"      <AccountName/>\n" +
				"      <Card>\n" +
				"        <EndDate>30-04-2018</EndDate>\n" +
				"        <CardAccount>26255210784446</CardAccount>\n" +
				"        <AccountId>134</AccountId>\n" +
				"        <CardNo>479751******9888</CardNo>\n" +
				"        <Contract/>\n" +
				"        <EmbossedName>IGOR MALININ</EmbossedName>\n" +
				"        <State>ACTIVE</State>\n" +
				"        <ContractId>61</ContractId>\n" +
				"        <IsPrimary>true</IsPrimary>\n" +
				"        <Type>VISA Gold 2</Type>\n" +
				"        <CurrencyCode>980</CurrencyCode>\n" +
				"        <Alarmed>0</Alarmed>\n" +
				"        <OwnerIdentifyCode/>\n" +
				"        <BranchDesc>АТ \"ОТП Банк\"</BranchDesc>\n" +
				"        <CardName>виза с деньгами</CardName>\n" +
				"        <TempLimitId/>\n" +
				"        <TempLimitFrom/>\n" +
				"        <TempLimitTill/>\n" +
				"        <TempLimitName/>\n" +
				"        <MainLimitName>Visa MTC UAH</MainLimitName>\n" +
				"        <SavingAccountNo/>\n" +
				"        <CardId>99BCFC08943E13AFCF298625895F3A96</CardId>\n" +
				"        <CardStateId>0</CardStateId>\n" +
				"        <SoftStopList>0</SoftStopList>\n" +
				"        <ResponseId/>\n" +
				"        <SwitchStatus>CANBLOCKCARD</SwitchStatus>\n" +
				"        <ShowCard>true</ShowCard>\n" +
				"        <PictureVersion>108</PictureVersion>\n" +
				"        <CanUnblock/>\n" +
				"        <ContractNumber>81</ContractNumber>\n" +
				"        <EnrolledDate>11-03-2014</EnrolledDate>\n" +
				"        <DisplayOrder>0</DisplayOrder>\n" +
				"      </Card>\n" +
				"    </AccountDetails>\n" +
				"    <AccountDetails>\n" +
				"      <Balances>\n" +
				"        <Ledger>0.00</Ledger>\n" +
				"        <Available/>\n" +
				"        <ProjectedLedger>0.00</ProjectedLedger>\n" +
				"        <OverdraftLimit>0.00</OverdraftLimit>\n" +
				"        <Moved/>\n" +
				"        <ActualizedTime/>\n" +
				"      </Balances>\n" +
				"      <Type>CARD</Type>\n" +
				"      <OwnerName>МАЛІНІН ІГОР</OwnerName>\n" +
				"      <OwnerAddress/>\n" +
				"      <Status/>\n" +
				"      <Access/>\n" +
				"      <TxId>21</TxId>\n" +
				"      <Currency>UAH</Currency>\n" +
				"      <BranchId>300528</BranchId>\n" +
				"      <AccountName/>\n" +
				"      <Card>\n" +
				"        <EndDate>30-04-2018</EndDate>\n" +
				"        <CardAccount>26252310784446</CardAccount>\n" +
				"        <AccountId>139</AccountId>\n" +
				"        <CardNo>510093******0021</CardNo>\n" +
				"        <Contract/>\n" +
				"        <EmbossedName>IGOR MALININ</EmbossedName>\n" +
				"        <State>ACTIVE</State>\n" +
				"        <ContractId>66</ContractId>\n" +
				"        <IsPrimary>true</IsPrimary>\n" +
				"        <Type>MasterCard Standard</Type>\n" +
				"        <CurrencyCode>980</CurrencyCode>\n" +
				"        <Alarmed>0</Alarmed>\n" +
				"        <OwnerIdentifyCode/>\n" +
				"        <BranchDesc>АТ \"ОТП Банк\"</BranchDesc>\n" +
				"        <CardName/>\n" +
				"        <TempLimitId/>\n" +
				"        <TempLimitFrom/>\n" +
				"        <TempLimitTill/>\n" +
				"        <TempLimitName/>\n" +
				"        <MainLimitName>Deposit 24-7 UAH</MainLimitName>\n" +
				"        <SavingAccountNo/>\n" +
				"        <CardId>0C333625F0407159E212FCA468449C25</CardId>\n" +
				"        <CardStateId>0</CardStateId>\n" +
				"        <SoftStopList>0</SoftStopList>\n" +
				"        <ResponseId/>\n" +
				"        <SwitchStatus>CANBLOCKCARD</SwitchStatus>\n" +
				"        <ShowCard>true</ShowCard>\n" +
				"        <PictureVersion>106</PictureVersion>\n" +
				"        <CanUnblock/>\n" +
				"        <ContractNumber>86</ContractNumber>\n" +
				"        <EnrolledDate>11-03-2014</EnrolledDate>\n" +
				"        <DisplayOrder>0</DisplayOrder>\n" +
				"      </Card>\n" +
				"    </AccountDetails>\n" +
				"    <AccountDetails>\n" +
				"      <Balances>\n" +
				"        <Ledger>0.00</Ledger>\n" +
				"        <Available/>\n" +
				"        <ProjectedLedger>0.00</ProjectedLedger>\n" +
				"        <OverdraftLimit>0.00</OverdraftLimit>\n" +
				"        <Moved/>\n" +
				"        <ActualizedTime/>\n" +
				"      </Balances>\n" +
				"      <Type>CARD</Type>\n" +
				"      <OwnerName>МАЛІНІН ІГОР</OwnerName>\n" +
				"      <OwnerAddress/>\n" +
				"      <Status/>\n" +
				"      <Access/>\n" +
				"      <TxId>22</TxId>\n" +
				"      <Currency>UAH</Currency>\n" +
				"      <BranchId>300528</BranchId>\n" +
				"      <AccountName/>\n" +
				"      <Card>\n" +
				"        <EndDate>31-05-2018</EndDate>\n" +
				"        <CardAccount>26252310784446</CardAccount>\n" +
				"        <AccountId>139</AccountId>\n" +
				"        <CardNo>510093******0047</CardNo>\n" +
				"        <Contract/>\n" +
				"        <EmbossedName>IGOR MALININ</EmbossedName>\n" +
				"        <State>ACTIVE</State>\n" +
				"        <ContractId>66</ContractId>\n" +
				"        <IsPrimary>false</IsPrimary>\n" +
				"        <Type>MasterCard Standard</Type>\n" +
				"        <CurrencyCode>980</CurrencyCode>\n" +
				"        <Alarmed>0</Alarmed>\n" +
				"        <OwnerIdentifyCode/>\n" +
				"        <BranchDesc>АТ \"ОТП Банк\"</BranchDesc>\n" +
				"        <CardName/>\n" +
				"        <TempLimitId/>\n" +
				"        <TempLimitFrom/>\n" +
				"        <TempLimitTill/>\n" +
				"        <TempLimitName/>\n" +
				"        <MainLimitName>Deposit 24-7 UAH</MainLimitName>\n" +
				"        <SavingAccountNo/>\n" +
				"        <CardId>C4DEFB5C4F1BC2112595FFFFE6DC32A4</CardId>\n" +
				"        <CardStateId>0</CardStateId>\n" +
				"        <SoftStopList>0</SoftStopList>\n" +
				"        <ResponseId/>\n" +
				"        <SwitchStatus>CANBLOCKCARD</SwitchStatus>\n" +
				"        <ShowCard>true</ShowCard>\n" +
				"        <PictureVersion>106</PictureVersion>\n" +
				"        <CanUnblock/>\n" +
				"        <ContractNumber>86</ContractNumber>\n" +
				"        <EnrolledDate>11-03-2014</EnrolledDate>\n" +
				"        <DisplayOrder>0</DisplayOrder>\n" +
				"      </Card>\n" +
				"    </AccountDetails>\n" +
				"    <AccountDetails>\n" +
				"      <Balances>\n" +
				"        <Ledger>0.00</Ledger>\n" +
				"        <Available/>\n" +
				"        <ProjectedLedger>0.00</ProjectedLedger>\n" +
				"        <OverdraftLimit>0.00</OverdraftLimit>\n" +
				"        <Moved/>\n" +
				"        <ActualizedTime/>\n" +
				"      </Balances>\n" +
				"      <Type>CARD</Type>\n" +
				"      <OwnerName>МАЛІНІН ІГОР</OwnerName>\n" +
				"      <OwnerAddress/>\n" +
				"      <Status/>\n" +
				"      <Access/>\n" +
				"      <TxId>23</TxId>\n" +
				"      <Currency>UAH</Currency>\n" +
				"      <BranchId>300528</BranchId>\n" +
				"      <AccountName/>\n" +
				"      <Card>\n" +
				"        <EndDate>31-05-2018</EndDate>\n" +
				"        <CardAccount>26255470784446</CardAccount>\n" +
				"        <AccountId>190</AccountId>\n" +
				"        <CardNo>533194******0057</CardNo>\n" +
				"        <Contract/>\n" +
				"        <EmbossedName>IGOR MALININ</EmbossedName>\n" +
				"        <State>ACTIVE</State>\n" +
				"        <ContractId>95</ContractId>\n" +
				"        <IsPrimary>true</IsPrimary>\n" +
				"        <Type>MasterCard World</Type>\n" +
				"        <CurrencyCode>980</CurrencyCode>\n" +
				"        <Alarmed>0</Alarmed>\n" +
				"        <OwnerIdentifyCode/>\n" +
				"        <BranchDesc>АТ \"ОТП Банк\"</BranchDesc>\n" +
				"        <CardName/>\n" +
				"        <TempLimitId/>\n" +
				"        <TempLimitFrom/>\n" +
				"        <TempLimitTill/>\n" +
				"        <TempLimitName/>\n" +
				"        <MainLimitName>MC Shell Cr Line UAH</MainLimitName>\n" +
				"        <SavingAccountNo/>\n" +
				"        <CardId>39581A8A70AA524BFB43EB6E9E21EB0A</CardId>\n" +
				"        <CardStateId>0</CardStateId>\n" +
				"        <SoftStopList>0</SoftStopList>\n" +
				"        <ResponseId/>\n" +
				"        <SwitchStatus>CANBLOCKCARD</SwitchStatus>\n" +
				"        <ShowCard>true</ShowCard>\n" +
				"        <PictureVersion>104</PictureVersion>\n" +
				"        <CanUnblock/>\n" +
				"        <ContractNumber>99</ContractNumber>\n" +
				"        <EnrolledDate>11-03-2014</EnrolledDate>\n" +
				"        <DisplayOrder>0</DisplayOrder>\n" +
				"      </Card>\n" +
				"    </AccountDetails>\n" +
				"    <AccountDetails>\n" +
				"      <Balances>\n" +
				"        <Ledger>0.00</Ledger>\n" +
				"        <Available/>\n" +
				"        <ProjectedLedger>0.00</ProjectedLedger>\n" +
				"        <OverdraftLimit>0.00</OverdraftLimit>\n" +
				"        <Moved/>\n" +
				"        <ActualizedTime/>\n" +
				"      </Balances>\n" +
				"      <Type>CARD</Type>\n" +
				"      <OwnerName>МАЛІНІН ІГОР</OwnerName>\n" +
				"      <OwnerAddress/>\n" +
				"      <Status/>\n" +
				"      <Access/>\n" +
				"      <TxId>25</TxId>\n" +
				"      <Currency>UAH</Currency>\n" +
				"      <BranchId>300528</BranchId>\n" +
				"      <AccountName/>\n" +
				"      <Card>\n" +
				"        <EndDate>30-06-2018</EndDate>\n" +
				"        <CardAccount>26255500784446</CardAccount>\n" +
				"        <AccountId>703</AccountId>\n" +
				"        <CardNo>410337******0041</CardNo>\n" +
				"        <Contract/>\n" +
				"        <EmbossedName>STUZHUK OLENA</EmbossedName>\n" +
				"        <State>ACTIVE</State>\n" +
				"        <ContractId>600</ContractId>\n" +
				"        <IsPrimary>false</IsPrimary>\n" +
				"        <Type>VISA Gold</Type>\n" +
				"        <CurrencyCode>980</CurrencyCode>\n" +
				"        <Alarmed>0</Alarmed>\n" +
				"        <OwnerIdentifyCode/>\n" +
				"        <BranchDesc>АТ \"ОТП Банк\"</BranchDesc>\n" +
				"        <CardName/>\n" +
				"        <TempLimitId/>\n" +
				"        <TempLimitFrom/>\n" +
				"        <TempLimitTill/>\n" +
				"        <TempLimitName/>\n" +
				"        <MainLimitName>Зарплатна картка VIS</MainLimitName>\n" +
				"        <SavingAccountNo/>\n" +
				"        <CardId>4F93228AF5A13746EE681950824FCA6C</CardId>\n" +
				"        <CardStateId>0</CardStateId>\n" +
				"        <SoftStopList>0</SoftStopList>\n" +
				"        <ResponseId/>\n" +
				"        <SwitchStatus>CANBLOCKCARD</SwitchStatus>\n" +
				"        <ShowCard>true</ShowCard>\n" +
				"        <PictureVersion/>\n" +
				"        <CanUnblock/>\n" +
				"        <ContractNumber>600</ContractNumber>\n" +
				"        <EnrolledDate>12-03-2014</EnrolledDate>\n" +
				"        <DisplayOrder>0</DisplayOrder>\n" +
				"      </Card>\n" +
				"    </AccountDetails>\n" +
				"    <AccountDetails>\n" +
				"      <Balances>\n" +
				"        <Ledger>0.00</Ledger>\n" +
				"        <Available/>\n" +
				"        <ProjectedLedger>0.00</ProjectedLedger>\n" +
				"        <OverdraftLimit>0.00</OverdraftLimit>\n" +
				"        <Moved/>\n" +
				"        <ActualizedTime/>\n" +
				"      </Balances>\n" +
				"      <Type>CARD</Type>\n" +
				"      <OwnerName>МАЛІНІН ІГОР</OwnerName>\n" +
				"      <OwnerAddress/>\n" +
				"      <Status/>\n" +
				"      <Access/>\n" +
				"      <TxId>28</TxId>\n" +
				"      <Currency>UAH</Currency>\n" +
				"      <BranchId>300528</BranchId>\n" +
				"      <AccountName/>\n" +
				"      <Card>\n" +
				"        <EndDate>30-06-2018</EndDate>\n" +
				"        <CardAccount>26255500784446</CardAccount>\n" +
				"        <AccountId>703</AccountId>\n" +
				"        <CardNo>410337******0082</CardNo>\n" +
				"        <Contract/>\n" +
				"        <EmbossedName>STUZHUK OLENA</EmbossedName>\n" +
				"        <State>ACTIVE</State>\n" +
				"        <ContractId>600</ContractId>\n" +
				"        <IsPrimary>false</IsPrimary>\n" +
				"        <Type>VISA Gold</Type>\n" +
				"        <CurrencyCode>980</CurrencyCode>\n" +
				"        <Alarmed>0</Alarmed>\n" +
				"        <OwnerIdentifyCode/>\n" +
				"        <BranchDesc>АТ \"ОТП Банк\"</BranchDesc>\n" +
				"        <CardName/>\n" +
				"        <TempLimitId/>\n" +
				"        <TempLimitFrom/>\n" +
				"        <TempLimitTill/>\n" +
				"        <TempLimitName/>\n" +
				"        <MainLimitName>Зарплатна картка VIS</MainLimitName>\n" +
				"        <SavingAccountNo/>\n" +
				"        <CardId>69EC6FFFCB6F73609598C74F75C592FA</CardId>\n" +
				"        <CardStateId>0</CardStateId>\n" +
				"        <SoftStopList>0</SoftStopList>\n" +
				"        <ResponseId/>\n" +
				"        <SwitchStatus>CANBLOCKCARD</SwitchStatus>\n" +
				"        <ShowCard>true</ShowCard>\n" +
				"        <PictureVersion/>\n" +
				"        <CanUnblock/>\n" +
				"        <ContractNumber>600</ContractNumber>\n" +
				"        <EnrolledDate>12-03-2014</EnrolledDate>\n" +
				"        <DisplayOrder>0</DisplayOrder>\n" +
				"      </Card>\n" +
				"    </AccountDetails>\n" +
				"    <AccountDetails>\n" +
				"      <Balances>\n" +
				"        <Ledger>0.00</Ledger>\n" +
				"        <Available/>\n" +
				"        <ProjectedLedger>0.00</ProjectedLedger>\n" +
				"        <OverdraftLimit>0.00</OverdraftLimit>\n" +
				"        <Moved/>\n" +
				"        <ActualizedTime/>\n" +
				"      </Balances>\n" +
				"      <Type>CARD</Type>\n" +
				"      <OwnerName>МАЛІНІН ІГОР</OwnerName>\n" +
				"      <OwnerAddress/>\n" +
				"      <Status/>\n" +
				"      <Access/>\n" +
				"      <TxId>29</TxId>\n" +
				"      <Currency>UAH</Currency>\n" +
				"      <BranchId>300528</BranchId>\n" +
				"      <AccountName/>\n" +
				"      <Card>\n" +
				"        <EndDate>30-06-2018</EndDate>\n" +
				"        <CardAccount>26255500784446</CardAccount>\n" +
				"        <AccountId>703</AccountId>\n" +
				"        <CardNo>410337******0116</CardNo>\n" +
				"        <Contract/>\n" +
				"        <EmbossedName>STUZHUK OLENA</EmbossedName>\n" +
				"        <State>ACTIVE</State>\n" +
				"        <ContractId>600</ContractId>\n" +
				"        <IsPrimary>false</IsPrimary>\n" +
				"        <Type>VISA Gold</Type>\n" +
				"        <CurrencyCode>980</CurrencyCode>\n" +
				"        <Alarmed>0</Alarmed>\n" +
				"        <OwnerIdentifyCode/>\n" +
				"        <BranchDesc>АТ \"ОТП Банк\"</BranchDesc>\n" +
				"        <CardName/>\n" +
				"        <TempLimitId/>\n" +
				"        <TempLimitFrom/>\n" +
				"        <TempLimitTill/>\n" +
				"        <TempLimitName/>\n" +
				"        <MainLimitName>Зарплатна картка VIS</MainLimitName>\n" +
				"        <SavingAccountNo/>\n" +
				"        <CardId>86B4FB49751C4FC9B46F7A02EB5C70E2</CardId>\n" +
				"        <CardStateId>0</CardStateId>\n" +
				"        <SoftStopList>0</SoftStopList>\n" +
				"        <ResponseId/>\n" +
				"        <SwitchStatus>CANBLOCKCARD</SwitchStatus>\n" +
				"        <ShowCard>true</ShowCard>\n" +
				"        <PictureVersion/>\n" +
				"        <CanUnblock/>\n" +
				"        <ContractNumber>600</ContractNumber>\n" +
				"        <EnrolledDate>12-03-2014</EnrolledDate>\n" +
				"        <DisplayOrder>0</DisplayOrder>\n" +
				"      </Card>\n" +
				"    </AccountDetails>\n" +
				"    <AccountDetails>\n" +
				"      <Balances>\n" +
				"        <Ledger>0.00</Ledger>\n" +
				"        <Available/>\n" +
				"        <ProjectedLedger>0.00</ProjectedLedger>\n" +
				"        <OverdraftLimit>0.00</OverdraftLimit>\n" +
				"        <Moved/>\n" +
				"        <ActualizedTime/>\n" +
				"      </Balances>\n" +
				"      <Type>CARD</Type>\n" +
				"      <OwnerName>МАЛІНІН ІГОР</OwnerName>\n" +
				"      <OwnerAddress/>\n" +
				"      <Status/>\n" +
				"      <Access/>\n" +
				"      <TxId>30</TxId>\n" +
				"      <Currency>UAH</Currency>\n" +
				"      <BranchId>300528</BranchId>\n" +
				"      <AccountName/>\n" +
				"      <Card>\n" +
				"        <EndDate>30-06-2018</EndDate>\n" +
				"        <CardAccount>26255500784446</CardAccount>\n" +
				"        <AccountId>703</AccountId>\n" +
				"        <CardNo>410337******0108</CardNo>\n" +
				"        <Contract/>\n" +
				"        <EmbossedName>STUZHUK OLENA</EmbossedName>\n" +
				"        <State>ACTIVE</State>\n" +
				"        <ContractId>600</ContractId>\n" +
				"        <IsPrimary>false</IsPrimary>\n" +
				"        <Type>VISA Gold</Type>\n" +
				"        <CurrencyCode>980</CurrencyCode>\n" +
				"        <Alarmed>0</Alarmed>\n" +
				"        <OwnerIdentifyCode/>\n" +
				"        <BranchDesc>АТ \"ОТП Банк\"</BranchDesc>\n" +
				"        <CardName/>\n" +
				"        <TempLimitId/>\n" +
				"        <TempLimitFrom/>\n" +
				"        <TempLimitTill/>\n" +
				"        <TempLimitName/>\n" +
				"        <MainLimitName>Зарплатна картка VIS</MainLimitName>\n" +
				"        <SavingAccountNo/>\n" +
				"        <CardId>5E4047881960C11CDF15F384DA7B1542</CardId>\n" +
				"        <CardStateId>0</CardStateId>\n" +
				"        <SoftStopList>0</SoftStopList>\n" +
				"        <ResponseId/>\n" +
				"        <SwitchStatus>CANBLOCKCARD</SwitchStatus>\n" +
				"        <ShowCard>true</ShowCard>\n" +
				"        <PictureVersion/>\n" +
				"        <CanUnblock/>\n" +
				"        <ContractNumber>600</ContractNumber>\n" +
				"        <EnrolledDate>12-03-2014</EnrolledDate>\n" +
				"        <DisplayOrder>0</DisplayOrder>\n" +
				"      </Card>\n" +
				"    </AccountDetails>\n" +
				"    <AccountDetails>\n" +
				"      <Balances>\n" +
				"        <Ledger>0.00</Ledger>\n" +
				"        <Available/>\n" +
				"        <ProjectedLedger>0.00</ProjectedLedger>\n" +
				"        <OverdraftLimit>0.00</OverdraftLimit>\n" +
				"        <Moved/>\n" +
				"        <ActualizedTime/>\n" +
				"      </Balances>\n" +
				"      <Type>CARD</Type>\n" +
				"      <OwnerName>МАЛІНІН ІГОР</OwnerName>\n" +
				"      <OwnerAddress/>\n" +
				"      <Status/>\n" +
				"      <Access/>\n" +
				"      <TxId>31</TxId>\n" +
				"      <Currency>UAH</Currency>\n" +
				"      <BranchId>300528</BranchId>\n" +
				"      <AccountName/>\n" +
				"      <Card>\n" +
				"        <EndDate>30-06-2018</EndDate>\n" +
				"        <CardAccount>26255500784446</CardAccount>\n" +
				"        <AccountId>703</AccountId>\n" +
				"        <CardNo>410337******0066</CardNo>\n" +
				"        <Contract/>\n" +
				"        <EmbossedName>STUZHUK OLENA</EmbossedName>\n" +
				"        <State>ACTIVE</State>\n" +
				"        <ContractId>600</ContractId>\n" +
				"        <IsPrimary>false</IsPrimary>\n" +
				"        <Type>VISA Gold</Type>\n" +
				"        <CurrencyCode>980</CurrencyCode>\n" +
				"        <Alarmed>0</Alarmed>\n" +
				"        <OwnerIdentifyCode/>\n" +
				"        <BranchDesc>АТ \"ОТП Банк\"</BranchDesc>\n" +
				"        <CardName/>\n" +
				"        <TempLimitId/>\n" +
				"        <TempLimitFrom/>\n" +
				"        <TempLimitTill/>\n" +
				"        <TempLimitName/>\n" +
				"        <MainLimitName>Зарплатна картка VIS</MainLimitName>\n" +
				"        <SavingAccountNo/>\n" +
				"        <CardId>14E2480F65CB913BBDB0198AC310A0CD</CardId>\n" +
				"        <CardStateId>0</CardStateId>\n" +
				"        <SoftStopList>0</SoftStopList>\n" +
				"        <ResponseId/>\n" +
				"        <SwitchStatus>CANBLOCKCARD</SwitchStatus>\n" +
				"        <ShowCard>true</ShowCard>\n" +
				"        <PictureVersion/>\n" +
				"        <CanUnblock/>\n" +
				"        <ContractNumber>600</ContractNumber>\n" +
				"        <EnrolledDate>12-03-2014</EnrolledDate>\n" +
				"        <DisplayOrder>0</DisplayOrder>\n" +
				"      </Card>\n" +
				"    </AccountDetails>\n" +
				"    <AccountDetails>\n" +
				"      <Balances>\n" +
				"        <Ledger>0.00</Ledger>\n" +
				"        <Available/>\n" +
				"        <ProjectedLedger>0.00</ProjectedLedger>\n" +
				"        <OverdraftLimit>0.00</OverdraftLimit>\n" +
				"        <Moved/>\n" +
				"        <ActualizedTime/>\n" +
				"      </Balances>\n" +
				"      <Type>CARD</Type>\n" +
				"      <OwnerName>МАЛІНІН ІГОР</OwnerName>\n" +
				"      <OwnerAddress/>\n" +
				"      <Status/>\n" +
				"      <Access/>\n" +
				"      <TxId>34</TxId>\n" +
				"      <Currency>UAH</Currency>\n" +
				"      <BranchId>300528</BranchId>\n" +
				"      <AccountName/>\n" +
				"      <Card>\n" +
				"        <EndDate>30-06-2018</EndDate>\n" +
				"        <CardAccount>26255500784446</CardAccount>\n" +
				"        <AccountId>703</AccountId>\n" +
				"        <CardNo>410337******0264</CardNo>\n" +
				"        <Contract/>\n" +
				"        <EmbossedName>STUZHUK OLENA</EmbossedName>\n" +
				"        <State>ACTIVE</State>\n" +
				"        <ContractId>600</ContractId>\n" +
				"        <IsPrimary>false</IsPrimary>\n" +
				"        <Type>VISA Gold</Type>\n" +
				"        <CurrencyCode>980</CurrencyCode>\n" +
				"        <Alarmed>0</Alarmed>\n" +
				"        <OwnerIdentifyCode/>\n" +
				"        <BranchDesc>АТ \"ОТП Банк\"</BranchDesc>\n" +
				"        <CardName/>\n" +
				"        <TempLimitId/>\n" +
				"        <TempLimitFrom/>\n" +
				"        <TempLimitTill/>\n" +
				"        <TempLimitName/>\n" +
				"        <MainLimitName>Зарплатна картка VIS</MainLimitName>\n" +
				"        <SavingAccountNo/>\n" +
				"        <CardId>CCDB954D9AB2FC0A96355A46A57D0830</CardId>\n" +
				"        <CardStateId>0</CardStateId>\n" +
				"        <SoftStopList>0</SoftStopList>\n" +
				"        <ResponseId/>\n" +
				"        <SwitchStatus>CANBLOCKCARD</SwitchStatus>\n" +
				"        <ShowCard>true</ShowCard>\n" +
				"        <PictureVersion/>\n" +
				"        <CanUnblock/>\n" +
				"        <ContractNumber>600</ContractNumber>\n" +
				"        <EnrolledDate>12-03-2014</EnrolledDate>\n" +
				"        <DisplayOrder>0</DisplayOrder>\n" +
				"      </Card>\n" +
				"    </AccountDetails>\n" +
				"    <AccountDetails>\n" +
				"      <Balances>\n" +
				"        <Ledger>0.00</Ledger>\n" +
				"        <Available/>\n" +
				"        <ProjectedLedger>0.00</ProjectedLedger>\n" +
				"        <OverdraftLimit>0.00</OverdraftLimit>\n" +
				"        <Moved/>\n" +
				"        <ActualizedTime/>\n" +
				"      </Balances>\n" +
				"      <Type>CARD</Type>\n" +
				"      <OwnerName>МАЛІНІН ІГОР</OwnerName>\n" +
				"      <OwnerAddress/>\n" +
				"      <Status/>\n" +
				"      <Access/>\n" +
				"      <TxId>37</TxId>\n" +
				"      <Currency>UAH</Currency>\n" +
				"      <BranchId>300528</BranchId>\n" +
				"      <AccountName/>\n" +
				"      <Card>\n" +
				"        <EndDate>30-06-2018</EndDate>\n" +
				"        <CardAccount>26252570784446</CardAccount>\n" +
				"        <AccountId>704</AccountId>\n" +
				"        <CardNo>533194*****0002</CardNo>\n" +
				"        <Contract/>\n" +
				"        <EmbossedName>STUZHUK OLENA</EmbossedName>\n" +
				"        <State>ACTIVE</State>\n" +
				"        <ContractId>601</ContractId>\n" +
				"        <IsPrimary>false</IsPrimary>\n" +
				"        <Type>MasterCard World</Type>\n" +
				"        <CurrencyCode>980</CurrencyCode>\n" +
				"        <Alarmed>0</Alarmed>\n" +
				"        <OwnerIdentifyCode/>\n" +
				"        <BranchDesc>АТ \"ОТП Банк\"</BranchDesc>\n" +
				"        <CardName/>\n" +
				"        <TempLimitId/>\n" +
				"        <TempLimitFrom/>\n" +
				"        <TempLimitTill/>\n" +
				"        <TempLimitName/>\n" +
				"        <MainLimitName>Дебетна карта SHELL</MainLimitName>\n" +
				"        <SavingAccountNo/>\n" +
				"        <CardId>5399DD438E5B8BC11C054ED4B67FBC76</CardId>\n" +
				"        <CardStateId>0</CardStateId>\n" +
				"        <SoftStopList>0</SoftStopList>\n" +
				"        <ResponseId/>\n" +
				"        <SwitchStatus>CANBLOCKCARD</SwitchStatus>\n" +
				"        <ShowCard>true</ShowCard>\n" +
				"        <PictureVersion>104</PictureVersion>\n" +
				"        <CanUnblock/>\n" +
				"        <ContractNumber>601</ContractNumber>\n" +
				"        <EnrolledDate>12-03-2014</EnrolledDate>\n" +
				"        <DisplayOrder>0</DisplayOrder>\n" +
				"      </Card>\n" +
				"    </AccountDetails>\n" +
				"    <AccountDetails>\n" +
				"      <Balances>\n" +
				"        <Ledger>0.00</Ledger>\n" +
				"        <Available/>\n" +
				"        <ProjectedLedger>0.00</ProjectedLedger>\n" +
				"        <OverdraftLimit>0.00</OverdraftLimit>\n" +
				"        <Moved/>\n" +
				"        <ActualizedTime/>\n" +
				"      </Balances>\n" +
				"      <Type>CARD</Type>\n" +
				"      <OwnerName>МАЛІНІН ІГОР</OwnerName>\n" +
				"      <OwnerAddress/>\n" +
				"      <Status/>\n" +
				"      <Access/>\n" +
				"      <TxId>38</TxId>\n" +
				"      <Currency>USD</Currency>\n" +
				"      <BranchId>300528</BranchId>\n" +
				"      <AccountName/>\n" +
				"      <Card>\n" +
				"        <EndDate>30-06-2018</EndDate>\n" +
				"        <CardAccount>26255050784446</CardAccount>\n" +
				"        <AccountId>705</AccountId>\n" +
				"        <CardNo>510093******0018</CardNo>\n" +
				"        <Contract/>\n" +
				"        <EmbossedName>IGOR MALININ</EmbossedName>\n" +
				"        <State>ACTIVE</State>\n" +
				"        <ContractId>602</ContractId>\n" +
				"        <IsPrimary>true</IsPrimary>\n" +
				"        <Type>MasterCard Standard</Type>\n" +
				"        <CurrencyCode>840</CurrencyCode>\n" +
				"        <Alarmed>0</Alarmed>\n" +
				"        <OwnerIdentifyCode/>\n" +
				"        <BranchDesc>АТ \"ОТП Банк\"</BranchDesc>\n" +
				"        <CardName/>\n" +
				"        <TempLimitId/>\n" +
				"        <TempLimitFrom/>\n" +
				"        <TempLimitTill/>\n" +
				"        <TempLimitName/>\n" +
				"        <MainLimitName>Дебетна карта депози</MainLimitName>\n" +
				"        <SavingAccountNo/>\n" +
				"        <CardId>A1E56168161398D44856E6099C4960C6</CardId>\n" +
				"        <CardStateId>0</CardStateId>\n" +
				"        <SoftStopList>0</SoftStopList>\n" +
				"        <ResponseId/>\n" +
				"        <SwitchStatus>CANBLOCKCARD</SwitchStatus>\n" +
				"        <ShowCard>true</ShowCard>\n" +
				"        <PictureVersion>106</PictureVersion>\n" +
				"        <CanUnblock/>\n" +
				"        <ContractNumber>602</ContractNumber>\n" +
				"        <EnrolledDate>12-03-2014</EnrolledDate>\n" +
				"        <DisplayOrder>0</DisplayOrder>\n" +
				"      </Card>\n" +
				"    </AccountDetails>\n" +
				"    <AccountDetails>\n" +
				"      <Balances>\n" +
				"        <Ledger>0.00</Ledger>\n" +
				"        <Available/>\n" +
				"        <ProjectedLedger>0.00</ProjectedLedger>\n" +
				"        <OverdraftLimit>0.00</OverdraftLimit>\n" +
				"        <Moved/>\n" +
				"        <ActualizedTime/>\n" +
				"      </Balances>\n" +
				"      <Type>CARD</Type>\n" +
				"      <OwnerName>МАЛІНІН ІГОР</OwnerName>\n" +
				"      <OwnerAddress/>\n" +
				"      <Status/>\n" +
				"      <Access/>\n" +
				"      <TxId>40</TxId>\n" +
				"      <Currency>UAH</Currency>\n" +
				"      <BranchId>300528</BranchId>\n" +
				"      <AccountName/>\n" +
				"      <Card>\n" +
				"        <EndDate>30-06-2018</EndDate>\n" +
				"        <CardAccount>26251720784446</CardAccount>\n" +
				"        <AccountId>725</AccountId>\n" +
				"        <CardNo>410337******0157</CardNo>\n" +
				"        <Contract/>\n" +
				"        <EmbossedName>IGOR MALININ</EmbossedName>\n" +
				"        <State>ACTIVE</State>\n" +
				"        <ContractId>622</ContractId>\n" +
				"        <IsPrimary>true</IsPrimary>\n" +
				"        <Type>VISA Gold</Type>\n" +
				"        <CurrencyCode>980</CurrencyCode>\n" +
				"        <Alarmed>0</Alarmed>\n" +
				"        <OwnerIdentifyCode/>\n" +
				"        <BranchDesc>АТ \"ОТП Банк\"</BranchDesc>\n" +
				"        <CardName/>\n" +
				"        <TempLimitId/>\n" +
				"        <TempLimitFrom/>\n" +
				"        <TempLimitTill/>\n" +
				"        <TempLimitName/>\n" +
				"        <MainLimitName>Зарплатна картка VIS</MainLimitName>\n" +
				"        <SavingAccountNo/>\n" +
				"        <CardId>A3BB56297638107A9526B2404068658A</CardId>\n" +
				"        <CardStateId>0</CardStateId>\n" +
				"        <SoftStopList>0</SoftStopList>\n" +
				"        <ResponseId/>\n" +
				"        <SwitchStatus>CANBLOCKCARD</SwitchStatus>\n" +
				"        <ShowCard>true</ShowCard>\n" +
				"        <PictureVersion/>\n" +
				"        <CanUnblock/>\n" +
				"        <ContractNumber>622</ContractNumber>\n" +
				"        <EnrolledDate>12-03-2014</EnrolledDate>\n" +
				"        <DisplayOrder>0</DisplayOrder>\n" +
				"      </Card>\n" +
				"    </AccountDetails>\n" +
				"    <AccountDetails>\n" +
				"      <Balances>\n" +
				"        <Ledger>0.00</Ledger>\n" +
				"        <Available/>\n" +
				"        <ProjectedLedger>0.00</ProjectedLedger>\n" +
				"        <OverdraftLimit>0.00</OverdraftLimit>\n" +
				"        <Moved/>\n" +
				"        <ActualizedTime/>\n" +
				"      </Balances>\n" +
				"      <Type>CARD</Type>\n" +
				"      <OwnerName>МАЛІНІН ІГОР</OwnerName>\n" +
				"      <OwnerAddress/>\n" +
				"      <Status/>\n" +
				"      <Access/>\n" +
				"      <TxId>41</TxId>\n" +
				"      <Currency>UAH</Currency>\n" +
				"      <BranchId>300528</BranchId>\n" +
				"      <AccountName/>\n" +
				"      <Card>\n" +
				"        <EndDate>30-06-2018</EndDate>\n" +
				"        <CardAccount>26252730784446</CardAccount>\n" +
				"        <AccountId>726</AccountId>\n" +
				"        <CardNo>410337******0165</CardNo>\n" +
				"        <Contract/>\n" +
				"        <EmbossedName>IGOR MALININ</EmbossedName>\n" +
				"        <State>ACTIVE</State>\n" +
				"        <ContractId>623</ContractId>\n" +
				"        <IsPrimary>true</IsPrimary>\n" +
				"        <Type>VISA Gold</Type>\n" +
				"        <CurrencyCode>980</CurrencyCode>\n" +
				"        <Alarmed>0</Alarmed>\n" +
				"        <OwnerIdentifyCode/>\n" +
				"        <BranchDesc>АТ \"ОТП Банк\"</BranchDesc>\n" +
				"        <CardName/>\n" +
				"        <TempLimitId/>\n" +
				"        <TempLimitFrom/>\n" +
				"        <TempLimitTill/>\n" +
				"        <TempLimitName/>\n" +
				"        <MainLimitName>Зарплатна картка VIS</MainLimitName>\n" +
				"        <SavingAccountNo/>\n" +
				"        <CardId>863E086BFA99B95F4234C80EC5ACF390</CardId>\n" +
				"        <CardStateId>0</CardStateId>\n" +
				"        <SoftStopList>0</SoftStopList>\n" +
				"        <ResponseId/>\n" +
				"        <SwitchStatus>CANBLOCKCARD</SwitchStatus>\n" +
				"        <ShowCard>true</ShowCard>\n" +
				"        <PictureVersion/>\n" +
				"        <CanUnblock/>\n" +
				"        <ContractNumber>623</ContractNumber>\n" +
				"        <EnrolledDate>12-03-2014</EnrolledDate>\n" +
				"        <DisplayOrder>0</DisplayOrder>\n" +
				"      </Card>\n" +
				"    </AccountDetails>\n" +
				"    <AccountDetails>\n" +
				"      <Balances>\n" +
				"        <Ledger>0.00</Ledger>\n" +
				"        <Available/>\n" +
				"        <ProjectedLedger>0.00</ProjectedLedger>\n" +
				"        <OverdraftLimit>0.00</OverdraftLimit>\n" +
				"        <Moved/>\n" +
				"        <ActualizedTime/>\n" +
				"      </Balances>\n" +
				"      <Type>CARD</Type>\n" +
				"      <OwnerName>МАЛІНІН ІГОР</OwnerName>\n" +
				"      <OwnerAddress/>\n" +
				"      <Status/>\n" +
				"      <Access/>\n" +
				"      <TxId>42</TxId>\n" +
				"      <Currency>UAH</Currency>\n" +
				"      <BranchId>300528</BranchId>\n" +
				"      <AccountName/>\n" +
				"      <Card>\n" +
				"        <EndDate>30-06-2018</EndDate>\n" +
				"        <CardAccount>26254750784446</CardAccount>\n" +
				"        <AccountId>729</AccountId>\n" +
				"        <CardNo>510093******0018</CardNo>\n" +
				"        <Contract/>\n" +
				"        <EmbossedName>IGOR MALININ</EmbossedName>\n" +
				"        <State>ACTIVE</State>\n" +
				"        <ContractId>624</ContractId>\n" +
				"        <IsPrimary>true</IsPrimary>\n" +
				"        <Type>MasterCard Standard</Type>\n" +
				"        <CurrencyCode>980</CurrencyCode>\n" +
				"        <Alarmed>0</Alarmed>\n" +
				"        <OwnerIdentifyCode/>\n" +
				"        <BranchDesc>АТ \"ОТП Банк\"</BranchDesc>\n" +
				"        <CardName/>\n" +
				"        <TempLimitId/>\n" +
				"        <TempLimitFrom/>\n" +
				"        <TempLimitTill/>\n" +
				"        <TempLimitName/>\n" +
				"        <MainLimitName>Зарплатна карта MC O</MainLimitName>\n" +
				"        <SavingAccountNo/>\n" +
				"        <CardId>9A639961042946622F417EB3BAC59066</CardId>\n" +
				"        <CardStateId>0</CardStateId>\n" +
				"        <SoftStopList>0</SoftStopList>\n" +
				"        <ResponseId/>\n" +
				"        <SwitchStatus>CANBLOCKCARD</SwitchStatus>\n" +
				"        <ShowCard>true</ShowCard>\n" +
				"        <PictureVersion>106</PictureVersion>\n" +
				"        <CanUnblock/>\n" +
				"        <ContractNumber>624</ContractNumber>\n" +
				"        <EnrolledDate>12-03-2014</EnrolledDate>\n" +
				"        <DisplayOrder>0</DisplayOrder>\n" +
				"      </Card>\n" +
				"    </AccountDetails>\n" +
				"    <AccountDetails>\n" +
				"      <Balances>\n" +
				"        <Ledger>0.00</Ledger>\n" +
				"        <Available/>\n" +
				"        <ProjectedLedger>0.00</ProjectedLedger>\n" +
				"        <OverdraftLimit>0.00</OverdraftLimit>\n" +
				"        <Moved/>\n" +
				"        <ActualizedTime/>\n" +
				"      </Balances>\n" +
				"      <Type>CARD</Type>\n" +
				"      <OwnerName>МАЛІНІН ІГОР</OwnerName>\n" +
				"      <OwnerAddress/>\n" +
				"      <Status/>\n" +
				"      <Access/>\n" +
				"      <TxId>43</TxId>\n" +
				"      <Currency>UAH</Currency>\n" +
				"      <BranchId>300528</BranchId>\n" +
				"      <AccountName/>\n" +
				"      <Card>\n" +
				"        <EndDate>30-06-2018</EndDate>\n" +
				"        <CardAccount>26255760784446</CardAccount>\n" +
				"        <AccountId>738</AccountId>\n" +
				"        <CardNo>436323******0014</CardNo>\n" +
				"        <Contract/>\n" +
				"        <EmbossedName>IGOR MALININ</EmbossedName>\n" +
				"        <State>ACTIVE</State>\n" +
				"        <ContractId>633</ContractId>\n" +
				"        <IsPrimary>true</IsPrimary>\n" +
				"        <Type>VISA Platinum</Type>\n" +
				"        <CurrencyCode>980</CurrencyCode>\n" +
				"        <Alarmed>0</Alarmed>\n" +
				"        <OwnerIdentifyCode/>\n" +
				"        <BranchDesc>АТ \"ОТП Банк\"</BranchDesc>\n" +
				"        <CardName/>\n" +
				"        <TempLimitId/>\n" +
				"        <TempLimitFrom/>\n" +
				"        <TempLimitTill/>\n" +
				"        <TempLimitName/>\n" +
				"        <MainLimitName>Дебетна карта Visa P</MainLimitName>\n" +
				"        <SavingAccountNo/>\n" +
				"        <CardId>E2C82FC09FC222CF726F2785215FA2C8</CardId>\n" +
				"        <CardStateId>0</CardStateId>\n" +
				"        <SoftStopList>0</SoftStopList>\n" +
				"        <ResponseId/>\n" +
				"        <SwitchStatus>CANBLOCKCARD</SwitchStatus>\n" +
				"        <ShowCard>true</ShowCard>\n" +
				"        <PictureVersion/>\n" +
				"        <CanUnblock/>\n" +
				"        <ContractNumber>633</ContractNumber>\n" +
				"        <EnrolledDate>12-03-2014</EnrolledDate>\n" +
				"        <DisplayOrder>0</DisplayOrder>\n" +
				"      </Card>\n" +
				"    </AccountDetails>\n" +
				"    <AccountDetails>\n" +
				"      <Balances>\n" +
				"        <Ledger>0.00</Ledger>\n" +
				"        <Available/>\n" +
				"        <ProjectedLedger>0.00</ProjectedLedger>\n" +
				"        <OverdraftLimit>0.00</OverdraftLimit>\n" +
				"        <Moved/>\n" +
				"        <ActualizedTime/>\n" +
				"      </Balances>\n" +
				"      <Type>CARD</Type>\n" +
				"      <OwnerName>МАЛІНІН ІГОР</OwnerName>\n" +
				"      <OwnerAddress/>\n" +
				"      <Status/>\n" +
				"      <Access/>\n" +
				"      <TxId>46</TxId>\n" +
				"      <Currency>UAH</Currency>\n" +
				"      <BranchId>300528</BranchId>\n" +
				"      <AccountName/>\n" +
				"      <Card>\n" +
				"        <EndDate>31-07-2018</EndDate>\n" +
				"        <CardAccount>26257780784446</CardAccount>\n" +
				"        <AccountId>778</AccountId>\n" +
				"        <CardNo>533194******0036</CardNo>\n" +
				"        <Contract/>\n" +
				"        <EmbossedName>IGOR MALININ</EmbossedName>\n" +
				"        <State>ACTIVE</State>\n" +
				"        <ContractId>673</ContractId>\n" +
				"        <IsPrimary>true</IsPrimary>\n" +
				"        <Type>MasterCard World</Type>\n" +
				"        <CurrencyCode>980</CurrencyCode>\n" +
				"        <Alarmed>0</Alarmed>\n" +
				"        <OwnerIdentifyCode/>\n" +
				"        <BranchDesc>АТ \"ОТП Банк\"</BranchDesc>\n" +
				"        <CardName/>\n" +
				"        <TempLimitId/>\n" +
				"        <TempLimitFrom/>\n" +
				"        <TempLimitTill/>\n" +
				"        <TempLimitName/>\n" +
				"        <MainLimitName>Дебетна карта SHELL</MainLimitName>\n" +
				"        <SavingAccountNo/>\n" +
				"        <CardId>FD0B5884E6FB90DAA858686E8159E440</CardId>\n" +
				"        <CardStateId>0</CardStateId>\n" +
				"        <SoftStopList>0</SoftStopList>\n" +
				"        <ResponseId/>\n" +
				"        <SwitchStatus>CANBLOCKCARD</SwitchStatus>\n" +
				"        <ShowCard>true</ShowCard>\n" +
				"        <PictureVersion>104</PictureVersion>\n" +
				"        <CanUnblock/>\n" +
				"        <ContractNumber>673</ContractNumber>\n" +
				"        <EnrolledDate>12-03-2014</EnrolledDate>\n" +
				"        <DisplayOrder>0</DisplayOrder>\n" +
				"      </Card>\n" +
				"    </AccountDetails>\n" +
				"    <AccountDetails>\n" +
				"      <Balances>\n" +
				"        <Ledger>0.00</Ledger>\n" +
				"        <Available/>\n" +
				"        <ProjectedLedger>0.00</ProjectedLedger>\n" +
				"        <OverdraftLimit>0.00</OverdraftLimit>\n" +
				"        <Moved/>\n" +
				"        <ActualizedTime/>\n" +
				"      </Balances>\n" +
				"      <Type>CARD</Type>\n" +
				"      <OwnerName>МАЛІНІН ІГОР</OwnerName>\n" +
				"      <OwnerAddress/>\n" +
				"      <Status/>\n" +
				"      <Access/>\n" +
				"      <TxId>48</TxId>\n" +
				"      <Currency>UAH</Currency>\n" +
				"      <BranchId>300528</BranchId>\n" +
				"      <AccountName/>\n" +
				"      <Card>\n" +
				"        <EndDate>31-07-2018</EndDate>\n" +
				"        <CardAccount>26256800784446</CardAccount>\n" +
				"        <AccountId>782</AccountId>\n" +
				"        <CardNo>533194******0051</CardNo>\n" +
				"        <Contract/>\n" +
				"        <EmbossedName>IGOR MALININ</EmbossedName>\n" +
				"        <State>ACTIVE</State>\n" +
				"        <ContractId>677</ContractId>\n" +
				"        <IsPrimary>true</IsPrimary>\n" +
				"        <Type>MasterCard World</Type>\n" +
				"        <CurrencyCode>980</CurrencyCode>\n" +
				"        <Alarmed>0</Alarmed>\n" +
				"        <OwnerIdentifyCode/>\n" +
				"        <BranchDesc>АТ \"ОТП Банк\"</BranchDesc>\n" +
				"        <CardName/>\n" +
				"        <TempLimitId/>\n" +
				"        <TempLimitFrom/>\n" +
				"        <TempLimitTill/>\n" +
				"        <TempLimitName/>\n" +
				"        <MainLimitName>Дебетна карта SHELL</MainLimitName>\n" +
				"        <SavingAccountNo/>\n" +
				"        <CardId>02602C42088D3BB10E51579CBF3A97FA</CardId>\n" +
				"        <CardStateId>0</CardStateId>\n" +
				"        <SoftStopList>0</SoftStopList>\n" +
				"        <ResponseId/>\n" +
				"        <SwitchStatus>CANBLOCKCARD</SwitchStatus>\n" +
				"        <ShowCard>true</ShowCard>\n" +
				"        <PictureVersion>104</PictureVersion>\n" +
				"        <CanUnblock/>\n" +
				"        <ContractNumber>677</ContractNumber>\n" +
				"        <EnrolledDate>12-03-2014</EnrolledDate>\n" +
				"        <DisplayOrder>0</DisplayOrder>\n" +
				"      </Card>\n" +
				"    </AccountDetails>\n" +
				"    <AccountDetails>\n" +
				"      <Balances>\n" +
				"        <Ledger>0.00</Ledger>\n" +
				"        <Available/>\n" +
				"        <ProjectedLedger>0.00</ProjectedLedger>\n" +
				"        <OverdraftLimit>0.00</OverdraftLimit>\n" +
				"        <Moved/>\n" +
				"        <ActualizedTime/>\n" +
				"      </Balances>\n" +
				"      <Type>CARD</Type>\n" +
				"      <OwnerName>МАЛІНІН ІГОР</OwnerName>\n" +
				"      <OwnerAddress/>\n" +
				"      <Status/>\n" +
				"      <Access/>\n" +
				"      <TxId>49</TxId>\n" +
				"      <Currency>UAH</Currency>\n" +
				"      <BranchId>300528</BranchId>\n" +
				"      <AccountName/>\n" +
				"      <Card>\n" +
				"        <EndDate>31-07-2018</EndDate>\n" +
				"        <CardAccount>26257810784446</CardAccount>\n" +
				"        <AccountId>783</AccountId>\n" +
				"        <CardNo>533194******0069</CardNo>\n" +
				"        <Contract/>\n" +
				"        <EmbossedName>IGOR MALININ</EmbossedName>\n" +
				"        <State>ACTIVE</State>\n" +
				"        <ContractId>678</ContractId>\n" +
				"        <IsPrimary>true</IsPrimary>\n" +
				"        <Type>MasterCard World</Type>\n" +
				"        <CurrencyCode>980</CurrencyCode>\n" +
				"        <Alarmed>0</Alarmed>\n" +
				"        <OwnerIdentifyCode/>\n" +
				"        <BranchDesc>АТ \"ОТП Банк\"</BranchDesc>\n" +
				"        <CardName/>\n" +
				"        <TempLimitId/>\n" +
				"        <TempLimitFrom/>\n" +
				"        <TempLimitTill/>\n" +
				"        <TempLimitName/>\n" +
				"        <MainLimitName>Дебетна карта SHELL</MainLimitName>\n" +
				"        <SavingAccountNo/>\n" +
				"        <CardId>B5B80388D0D0F5308B558E5EFAF9ACBD</CardId>\n" +
				"        <CardStateId>0</CardStateId>\n" +
				"        <SoftStopList>0</SoftStopList>\n" +
				"        <ResponseId/>\n" +
				"        <SwitchStatus>CANBLOCKCARD</SwitchStatus>\n" +
				"        <ShowCard>true</ShowCard>\n" +
				"        <PictureVersion>104</PictureVersion>\n" +
				"        <CanUnblock/>\n" +
				"        <ContractNumber>678</ContractNumber>\n" +
				"        <EnrolledDate>12-03-2014</EnrolledDate>\n" +
				"        <DisplayOrder>0</DisplayOrder>\n" +
				"      </Card>\n" +
				"    </AccountDetails>\n" +
				"    <AccountDetails>\n" +
				"      <Balances>\n" +
				"        <Ledger>0.00</Ledger>\n" +
				"        <Available/>\n" +
				"        <ProjectedLedger>0.00</ProjectedLedger>\n" +
				"        <OverdraftLimit>0.00</OverdraftLimit>\n" +
				"        <Moved/>\n" +
				"        <ActualizedTime/>\n" +
				"      </Balances>\n" +
				"      <Type>CARD</Type>\n" +
				"      <OwnerName>МАЛІНІН ІГОР</OwnerName>\n" +
				"      <OwnerAddress/>\n" +
				"      <Status/>\n" +
				"      <Access/>\n" +
				"      <TxId>50</TxId>\n" +
				"      <Currency>UAH</Currency>\n" +
				"      <BranchId>300528</BranchId>\n" +
				"      <AccountName/>\n" +
				"      <Card>\n" +
				"        <EndDate>31-07-2018</EndDate>\n" +
				"        <CardAccount>26258820784446</CardAccount>\n" +
				"        <AccountId>789</AccountId>\n" +
				"        <CardNo>533194******0077</CardNo>\n" +
				"        <Contract/>\n" +
				"        <EmbossedName>IGOR MALININ</EmbossedName>\n" +
				"        <State>ACTIVE</State>\n" +
				"        <ContractId>684</ContractId>\n" +
				"        <IsPrimary>true</IsPrimary>\n" +
				"        <Type>MasterCard World</Type>\n" +
				"        <CurrencyCode>980</CurrencyCode>\n" +
				"        <Alarmed>0</Alarmed>\n" +
				"        <OwnerIdentifyCode/>\n" +
				"        <BranchDesc>АТ \"ОТП Банк\"</BranchDesc>\n" +
				"        <CardName/>\n" +
				"        <TempLimitId/>\n" +
				"        <TempLimitFrom/>\n" +
				"        <TempLimitTill/>\n" +
				"        <TempLimitName/>\n" +
				"        <MainLimitName>Дебетна карта SHELL</MainLimitName>\n" +
				"        <SavingAccountNo/>\n" +
				"        <CardId>534BAE5C36835F8EC233B3CEF77BECA7</CardId>\n" +
				"        <CardStateId>0</CardStateId>\n" +
				"        <SoftStopList>0</SoftStopList>\n" +
				"        <ResponseId/>\n" +
				"        <SwitchStatus>CANBLOCKCARD</SwitchStatus>\n" +
				"        <ShowCard>true</ShowCard>\n" +
				"        <PictureVersion>104</PictureVersion>\n" +
				"        <CanUnblock/>\n" +
				"        <ContractNumber>684</ContractNumber>\n" +
				"        <EnrolledDate>12-03-2014</EnrolledDate>\n" +
				"        <DisplayOrder>0</DisplayOrder>\n" +
				"      </Card>\n" +
				"    </AccountDetails>\n" +
				"    <AccountDetails>\n" +
				"      <Balances>\n" +
				"        <Ledger>0.00</Ledger>\n" +
				"        <Available/>\n" +
				"        <ProjectedLedger>0.00</ProjectedLedger>\n" +
				"        <OverdraftLimit>0.00</OverdraftLimit>\n" +
				"        <Moved/>\n" +
				"        <ActualizedTime/>\n" +
				"      </Balances>\n" +
				"      <Type>CARD</Type>\n" +
				"      <OwnerName>МАЛІНІН ІГОР</OwnerName>\n" +
				"      <OwnerAddress/>\n" +
				"      <Status/>\n" +
				"      <Access/>\n" +
				"      <TxId>51</TxId>\n" +
				"      <Currency>UAH</Currency>\n" +
				"      <BranchId>300528</BranchId>\n" +
				"      <AccountName/>\n" +
				"      <Card>\n" +
				"        <EndDate>31-07-2018</EndDate>\n" +
				"        <CardAccount>26259830784446</CardAccount>\n" +
				"        <AccountId>790</AccountId>\n" +
				"        <CardNo>533194******0033</CardNo>\n" +
				"        <Contract/>\n" +
				"        <EmbossedName>IGOR MALININ</EmbossedName>\n" +
				"        <State>ACTIVE</State>\n" +
				"        <ContractId>685</ContractId>\n" +
				"        <IsPrimary>true</IsPrimary>\n" +
				"        <Type>MasterCard World</Type>\n" +
				"        <CurrencyCode>980</CurrencyCode>\n" +
				"        <Alarmed>0</Alarmed>\n" +
				"        <OwnerIdentifyCode/>\n" +
				"        <BranchDesc>АТ \"ОТП Банк\"</BranchDesc>\n" +
				"        <CardName/>\n" +
				"        <TempLimitId/>\n" +
				"        <TempLimitFrom/>\n" +
				"        <TempLimitTill/>\n" +
				"        <TempLimitName/>\n" +
				"        <MainLimitName>Дебетна карта SHELL</MainLimitName>\n" +
				"        <SavingAccountNo/>\n" +
				"        <CardId>75A3D0A456F05DF52F82C1E911C4AAA2</CardId>\n" +
				"        <CardStateId>0</CardStateId>\n" +
				"        <SoftStopList>0</SoftStopList>\n" +
				"        <ResponseId/>\n" +
				"        <SwitchStatus>CANBLOCKCARD</SwitchStatus>\n" +
				"        <ShowCard>true</ShowCard>\n" +
				"        <PictureVersion>104</PictureVersion>\n" +
				"        <CanUnblock/>\n" +
				"        <ContractNumber>685</ContractNumber>\n" +
				"        <EnrolledDate>12-03-2014</EnrolledDate>\n" +
				"        <DisplayOrder>0</DisplayOrder>\n" +
				"      </Card>\n" +
				"    </AccountDetails>\n" +
				"    <AccountDetails>\n" +
				"      <Balances>\n" +
				"        <Ledger>0.00</Ledger>\n" +
				"        <Available/>\n" +
				"        <ProjectedLedger>0.00</ProjectedLedger>\n" +
				"        <OverdraftLimit>0.00</OverdraftLimit>\n" +
				"        <Moved/>\n" +
				"        <ActualizedTime/>\n" +
				"      </Balances>\n" +
				"      <Type>CARD</Type>\n" +
				"      <OwnerName>МАЛІНІН ІГОР</OwnerName>\n" +
				"      <OwnerAddress/>\n" +
				"      <Status/>\n" +
				"      <Access/>\n" +
				"      <TxId>52</TxId>\n" +
				"      <Currency>UAH</Currency>\n" +
				"      <BranchId>300528</BranchId>\n" +
				"      <AccountName/>\n" +
				"      <Card>\n" +
				"        <EndDate>31-07-2018</EndDate>\n" +
				"        <CardAccount>26250840784446</CardAccount>\n" +
				"        <AccountId>791</AccountId>\n" +
				"        <CardNo>533194******0085</CardNo>\n" +
				"        <Contract/>\n" +
				"        <EmbossedName>IGOR MALININ</EmbossedName>\n" +
				"        <State>ACTIVE</State>\n" +
				"        <ContractId>686</ContractId>\n" +
				"        <IsPrimary>true</IsPrimary>\n" +
				"        <Type>MasterCard World</Type>\n" +
				"        <CurrencyCode>980</CurrencyCode>\n" +
				"        <Alarmed>0</Alarmed>\n" +
				"        <OwnerIdentifyCode/>\n" +
				"        <BranchDesc>АТ \"ОТП Банк\"</BranchDesc>\n" +
				"        <CardName/>\n" +
				"        <TempLimitId/>\n" +
				"        <TempLimitFrom/>\n" +
				"        <TempLimitTill/>\n" +
				"        <TempLimitName/>\n" +
				"        <MainLimitName>Дебетна карта SHELL</MainLimitName>\n" +
				"        <SavingAccountNo/>\n" +
				"        <CardId>E78C9A1E749D444FFB45675B1325E781</CardId>\n" +
				"        <CardStateId>0</CardStateId>\n" +
				"        <SoftStopList>0</SoftStopList>\n" +
				"        <ResponseId/>\n" +
				"        <SwitchStatus>CANBLOCKCARD</SwitchStatus>\n" +
				"        <ShowCard>true</ShowCard>\n" +
				"        <PictureVersion>104</PictureVersion>\n" +
				"        <CanUnblock/>\n" +
				"        <ContractNumber>686</ContractNumber>\n" +
				"        <EnrolledDate>12-03-2014</EnrolledDate>\n" +
				"        <DisplayOrder>0</DisplayOrder>\n" +
				"      </Card>\n" +
				"    </AccountDetails>\n" +
				"  </Parameters>\n" +
				"</Response>\n";
		XMLAndMarshallerHelper helper = new XMLAndMarshallerHelper();
		message = helper.geResponseWithParamType(message, "CardListResponseParametersType");
		//ZipHelper zip = new ZipHelper("cp1251");
		//message = zip.DecompressGZIP(Base64.decode(message.getBytes("cp1251")));
		//String response = wmServiceBean.callService(message);
		System.out.println(message);
	}
}
