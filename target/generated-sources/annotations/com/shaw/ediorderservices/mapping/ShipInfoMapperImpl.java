package com.shaw.ediorderservices.mapping;

import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderHeader;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderLine;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderLine.EdiOrderLinePK;
import com.shaw.ediorderservices.persistance.db2.entity.EdiShipInfo;
import com.shaw.ediorderservices.persistance.db2.entity.EdiShipInfo.EdiShipInfoPK;
import com.shaw.ediorderservices.persistance.db2.entity.EdiShipInfoLn;
import com.shaw.ediorderservices.persistance.db2.entity.EdiShipInfoLn.EdiShipInfoLnPK;
import com.shaw.ediorderservices.persistance.db2.entity.LegacyShipToAddress;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
<<<<<<< Updated upstream
<<<<<<< HEAD
    date = "2020-06-09T08:49:53-0400",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 3.20.0.v20191203-2131, environment: Java 1.8.0_241 (Oracle Corporation)"
=======
    date = "2020-06-09T18:22:02-0400",
=======
    date = "2020-06-16T14:23:59-0400",
>>>>>>> Stashed changes
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 3.21.0.v20200304-1404, environment: Java 14.0.1 (Oracle Corporation)"
>>>>>>> 319fd74e6b77d79ce2f29be4907fd93101894f9c
)
@Component
public class ShipInfoMapperImpl implements ShipInfoMapper {

    @Override
    public EdiShipInfo EdiOrderHeaderToShipInfo(EdiOrderHeader header) {
        if ( header == null ) {
            return null;
        }

        EdiShipInfo ediShipInfo = new EdiShipInfo();

        ediShipInfo.setId( ediOrderHeaderToEdiShipInfoPK( header ) );
        ediShipInfo.setReceivingStore( header.getMarkForStore() );
        ediShipInfo.setConsumerAddress( header.getConsumerAddress() );
<<<<<<< HEAD
        ediShipInfo.setBillToStoreNbr( header.getBillToStore() );
        ediShipInfo.setPoDate( header.getPoDateValue() );
        ediShipInfo.setAgreementNbr( header.getAgreementNumber() );
        ediShipInfo.setAuthorizationNo( header.getAuthorizationNo() );
        ediShipInfo.setAcctContact( header.getAcctContact() );
        ediShipInfo.setAuthRep( header.getAuthRep() );
=======
        ediShipInfo.setVendorNo( header.getVendorNo() );
        ediShipInfo.setCustPo( header.getPoNumber() );
        ediShipInfo.setCrossDock( header.getCrossDockCenter() );
        ediShipInfo.setSalesCheckNo( header.getSalesCheckNumber() );
        ediShipInfo.setBillToStoreNbr( header.getBillToStore() );
        ediShipInfo.setPoDate( header.getPoDateValue() );
        ediShipInfo.setAgreementNbr( header.getAgreementNumber() );
        ediShipInfo.setShipToDestCode( headerShipToAddressDestCode( header ) );
        ediShipInfo.setSpecPoNumber( header.getSpecialPoNo() );
        ediShipInfo.setOrderingSys( header.getOrderingSystem() );
        ediShipInfo.setDepartment( header.getCustDept() );
        ediShipInfo.setAcctContact( header.getAcctContact() );
        ediShipInfo.setAuthRep( header.getAuthRep() );
        ediShipInfo.setAuthorizationNo( header.getAuthorizationNo() );
>>>>>>> 319fd74e6b77d79ce2f29be4907fd93101894f9c
        ediShipInfo.setBsStoreNbr( header.getBsStoreNbr() );
        ediShipInfo.setCommCust( header.getCommCust() );
        ediShipInfo.setConsStatusMsg( header.getConsStatusMsg() );
        ediShipInfo.setCustNbr( header.getCustNbr() );
        ediShipInfo.setCustPmtMeth( header.getCustPmtMeth() );
        ediShipInfo.setCustSpInst( header.getCustSpInst() );
        ediShipInfo.setCustWhNbr( header.getCustWhNbr() );
        ediShipInfo.setCustomerCode( header.getCustomerCode() );
        ediShipInfo.setDeliveryDate( header.getDeliveryDate() );
        ediShipInfo.setDivDesc( header.getDivDesc() );
        ediShipInfo.setDunsNbr( header.getDunsNbr() );
        ediShipInfo.setEventInfo( header.getEventInfo() );
        ediShipInfo.setGiftMessage1( header.getGiftMessage1() );
        ediShipInfo.setGiftMessage2( header.getGiftMessage2() );
<<<<<<< HEAD
=======
        ediShipInfo.setLines( ediOrderLineListToEdiShipInfoLnList( header.getLines() ) );
>>>>>>> 319fd74e6b77d79ce2f29be4907fd93101894f9c
        ediShipInfo.setNbDate( header.getNbDate() );
        ediShipInfo.setNoAsnFlag( header.getNoAsnFlag() );
        ediShipInfo.setOnlineType( header.getOnlineType() );
        if ( header.getOrderMerCost() != null ) {
            ediShipInfo.setOrderMerCost( header.getOrderMerCost().longValue() );
        }
        if ( header.getOrderRetHand() != null ) {
            ediShipInfo.setOrderRetHand( header.getOrderRetHand().longValue() );
        }
        if ( header.getOrderRetSh() != null ) {
            ediShipInfo.setOrderRetSh( header.getOrderRetSh().longValue() );
        }
        if ( header.getOrderRetTax() != null ) {
            ediShipInfo.setOrderRetTax( header.getOrderRetTax().longValue() );
        }
        if ( header.getOrderRetTotal() != null ) {
            ediShipInfo.setOrderRetTotal( header.getOrderRetTotal().longValue() );
        }
        ediShipInfo.setOrderType( header.getOrderType() );
        ediShipInfo.setOrderTypeDesc( header.getOrderTypeDesc() );
        ediShipInfo.setPoTypeSuffix( header.getPoTypeSuffix() );
        ediShipInfo.setPsMsg( header.getPsMsg() );
        ediShipInfo.setPurchasedBy( header.getPurchasedBy() );
        ediShipInfo.setRefTcNbr( header.getRefTcNbr() );
        ediShipInfo.setReturnMsg( header.getReturnMsg() );
        ediShipInfo.setRouteByDate( header.getRouteByDate() );
        ediShipInfo.setSalesReqCode( header.getSalesReqCode() );
        ediShipInfo.setShipByDate( header.getShipByDate() );
        ediShipInfo.setShipCancelDate( header.getShipCancelDate() );
        ediShipInfo.setStoreName( header.getStoreName() );
<<<<<<< HEAD
        ediShipInfo.setVendorNo( header.getVendorNo() );
        ediShipInfo.setLines( ediOrderLineListToEdiShipInfoLnList( header.getLines() ) );
=======
>>>>>>> 319fd74e6b77d79ce2f29be4907fd93101894f9c

        return ediShipInfo;
    }

    @Override
    public EdiShipInfoLn EdiLineToShipInfoLn(EdiOrderLine ediLine) {
        if ( ediLine == null ) {
            return null;
        }

        EdiShipInfoLn ediShipInfoLn = new EdiShipInfoLn();

        ediShipInfoLn.setId( ediOrderLinePKToEdiShipInfoLnPK( ediLine.getId() ) );
        if ( ediLine.getQuantityOrdered() != null ) {
            ediShipInfoLn.setOrderQtyFt( ediLine.getQuantityOrdered().intValue() );
        }
        if ( ediLine.getQuantityOrdered() != null ) {
            ediShipInfoLn.setLength( ediLine.getQuantityOrdered() );
        }
        ediShipInfoLn.setEdiItemNbr( ediLine.getItemNo() );
        ediShipInfoLn.setUom( ediLine.getUomCode() );
        if ( ediLine.getRetailPrice() != null ) {
            ediShipInfoLn.setPrice( ediLine.getRetailPrice() );
        }
        ediShipInfoLn.setStyleNbr( ediLine.getStyle() );
        if ( ediLine.getQuantityOrdered() != null ) {
            ediShipInfoLn.setCustQty( ediLine.getQuantityOrdered() );
        }
        ediShipInfoLn.setColorNbr( ediLine.getColor() );
        ediShipInfoLn.setAddCustProdInfo( ediLine.getAddCustProdInfo() );
        ediShipInfoLn.setConsMsg( ediLine.getConsMsg() );
        ediShipInfoLn.setCustProdDesc( ediLine.getCustProdDesc() );
        ediShipInfoLn.setCustProdId( ediLine.getCustProdId() );
        ediShipInfoLn.setCustReqShipDate( ediLine.getCustReqShipDate() );
        ediShipInfoLn.setCustSzDesc( ediLine.getCustSzDesc() );
        ediShipInfoLn.setDeptNbr( ediLine.getDeptNbr() );
        ediShipInfoLn.setGtinNbr( ediLine.getGtinNbr() );
        ediShipInfoLn.setPriceUom( ediLine.getPriceUom() );
        ediShipInfoLn.setReceiptId( ediLine.getReceiptId() );
        ediShipInfoLn.setReqDyelot( ediLine.getReqDyelot() );
        ediShipInfoLn.setReqDyelotQual( ediLine.getReqDyelotQual() );
        if ( ediLine.getRetLnTotal() != null ) {
            ediShipInfoLn.setRetLnTotal( ediLine.getRetLnTotal() );
        }
        ediShipInfoLn.setRetTxDesc( ediLine.getRetTxDesc() );
        if ( ediLine.getRetailAllowance() != null ) {
            ediShipInfoLn.setRetailAllowance( ediLine.getRetailAllowance() );
        }
        if ( ediLine.getRetailPrice() != null ) {
            ediShipInfoLn.setRetailPrice( ediLine.getRetailPrice() );
        }
        if ( ediLine.getRetailShPrice() != null ) {
            ediShipInfoLn.setRetailShPrice( ediLine.getRetailShPrice() );
        }
        if ( ediLine.getRetailTax() != null ) {
            ediShipInfoLn.setRetailTax( ediLine.getRetailTax() );
        }
        ediShipInfoLn.setReturnMsg( ediLine.getReturnMsg() );
        if ( ediLine.getUnitPrice() != null ) {
            ediShipInfoLn.setUnitPrice( ediLine.getUnitPrice() );
        }
        ediShipInfoLn.setUpcCode( ediLine.getUpcCode() );

        ediShipInfoLn.setLastChngId( "" );
        ediShipInfoLn.setRollNbr( "" );
        ediShipInfoLn.setOrderQtyIn( 0 );

        return ediShipInfoLn;
    }

    protected EdiShipInfoPK ediOrderHeaderToEdiShipInfoPK(EdiOrderHeader ediOrderHeader) {
        if ( ediOrderHeader == null ) {
            return null;
        }

        EdiShipInfoPK ediShipInfoPK = new EdiShipInfoPK();

        ediShipInfoPK.setOrderNbr( ediOrderHeader.getShawOrderNumber() );

        ediShipInfoPK.setDateStamp( java.time.LocalDate.now() );

        return ediShipInfoPK;
    }

    private String headerShipToAddressDestCode(EdiOrderHeader ediOrderHeader) {
        if ( ediOrderHeader == null ) {
            return null;
        }
        LegacyShipToAddress shipToAddress = ediOrderHeader.getShipToAddress();
        if ( shipToAddress == null ) {
            return null;
        }
<<<<<<< Updated upstream

        EdiShipInfoLn ediShipInfoLn = new EdiShipInfoLn();

<<<<<<< HEAD
        ediShipInfoLn.setId( ediOrderLinePKToEdiShipInfoLnPK( ediOrderLine.getId() ) );
=======
>>>>>>> 319fd74e6b77d79ce2f29be4907fd93101894f9c
        ediShipInfoLn.setAddCustProdInfo( ediOrderLine.getAddCustProdInfo() );
        ediShipInfoLn.setConsMsg( ediOrderLine.getConsMsg() );
        ediShipInfoLn.setCustProdDesc( ediOrderLine.getCustProdDesc() );
        ediShipInfoLn.setCustProdId( ediOrderLine.getCustProdId() );
        if ( ediOrderLine.getCustReqShipDate() != null ) {
            ediShipInfoLn.setCustReqShipDate( Date.from( ediOrderLine.getCustReqShipDate().atStartOfDay( ZoneOffset.UTC ).toInstant() ) );
        }
        ediShipInfoLn.setCustSzDesc( ediOrderLine.getCustSzDesc() );
        ediShipInfoLn.setDeptNbr( ediOrderLine.getDeptNbr() );
        ediShipInfoLn.setGtinNbr( ediOrderLine.getGtinNbr() );
<<<<<<< HEAD
=======
        ediShipInfoLn.setId( ediOrderLinePKToEdiShipInfoLnPK( ediOrderLine.getId() ) );
>>>>>>> 319fd74e6b77d79ce2f29be4907fd93101894f9c
        ediShipInfoLn.setPriceUom( ediOrderLine.getPriceUom() );
        ediShipInfoLn.setReceiptId( ediOrderLine.getReceiptId() );
        ediShipInfoLn.setReqDyelot( ediOrderLine.getReqDyelot() );
        ediShipInfoLn.setReqDyelotQual( ediOrderLine.getReqDyelotQual() );
        if ( ediOrderLine.getRetLnTotal() != null ) {
            ediShipInfoLn.setRetLnTotal( BigDecimal.valueOf( ediOrderLine.getRetLnTotal() ) );
        }
        ediShipInfoLn.setRetTxDesc( ediOrderLine.getRetTxDesc() );
        if ( ediOrderLine.getRetailAllowance() != null ) {
            ediShipInfoLn.setRetailAllowance( BigDecimal.valueOf( ediOrderLine.getRetailAllowance() ) );
        }
        if ( ediOrderLine.getRetailPrice() != null ) {
            ediShipInfoLn.setRetailPrice( BigDecimal.valueOf( ediOrderLine.getRetailPrice() ) );
        }
        if ( ediOrderLine.getRetailShPrice() != null ) {
            ediShipInfoLn.setRetailShPrice( BigDecimal.valueOf( ediOrderLine.getRetailShPrice() ) );
        }
        if ( ediOrderLine.getRetailTax() != null ) {
            ediShipInfoLn.setRetailTax( BigDecimal.valueOf( ediOrderLine.getRetailTax() ) );
        }
        ediShipInfoLn.setReturnMsg( ediOrderLine.getReturnMsg() );
        if ( ediOrderLine.getUnitPrice() != null ) {
            ediShipInfoLn.setUnitPrice( BigDecimal.valueOf( ediOrderLine.getUnitPrice() ) );
=======
        String destCode = shipToAddress.getDestCode();
        if ( destCode == null ) {
            return null;
>>>>>>> Stashed changes
        }
        return destCode;
    }

    protected List<EdiShipInfoLn> ediOrderLineListToEdiShipInfoLnList(List<EdiOrderLine> list) {
        if ( list == null ) {
            return null;
        }

        List<EdiShipInfoLn> list1 = new ArrayList<EdiShipInfoLn>( list.size() );
        for ( EdiOrderLine ediOrderLine : list ) {
            list1.add( EdiLineToShipInfoLn( ediOrderLine ) );
        }

        return list1;
    }

    protected EdiShipInfoLnPK ediOrderLinePKToEdiShipInfoLnPK(EdiOrderLinePK ediOrderLinePK) {
        if ( ediOrderLinePK == null ) {
            return null;
        }

        EdiShipInfoLnPK ediShipInfoLnPK = new EdiShipInfoLnPK();

        if ( ediOrderLinePK.getPoLineNo() != null ) {
            ediShipInfoLnPK.setLineNbr( Long.parseLong( ediOrderLinePK.getPoLineNo() ) );
        }

        return ediShipInfoLnPK;
    }
}
