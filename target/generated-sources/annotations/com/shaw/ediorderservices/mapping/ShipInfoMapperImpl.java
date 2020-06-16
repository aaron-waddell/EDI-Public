package com.shaw.ediorderservices.mapping;

import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderHeader;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderLine;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderLine.EdiOrderLinePK;
import com.shaw.ediorderservices.persistance.db2.entity.EdiShipInfo;
import com.shaw.ediorderservices.persistance.db2.entity.EdiShipInfo.EdiShipInfoPK;
import com.shaw.ediorderservices.persistance.db2.entity.EdiShipInfoLn;
import com.shaw.ediorderservices.persistance.db2.entity.EdiShipInfoLn.EdiShipInfoLnPK;
import com.shaw.ediorderservices.persistance.sqlserver.entity.line.EdiLine;
import java.math.BigDecimal;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
<<<<<<< HEAD
    date = "2020-06-09T08:49:53-0400",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 3.20.0.v20191203-2131, environment: Java 1.8.0_241 (Oracle Corporation)"
=======
    date = "2020-06-09T18:22:02-0400",
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
    public EdiShipInfoLn EdiLineToShipInfoLn(EdiLine line) {
        if ( line == null ) {
            return null;
        }

        EdiShipInfoLn ediShipInfoLn = new EdiShipInfoLn();

        ediShipInfoLn.setId( ediLineToEdiShipInfoLnPK( line ) );
        if ( line.getCustReqShipDate() != null ) {
            ediShipInfoLn.setCustReqShipDate( Date.from( line.getCustReqShipDate().atStartOfDay( ZoneOffset.UTC ).toInstant() ) );
        }

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

    protected EdiShipInfoLnPK ediOrderLinePKToEdiShipInfoLnPK(EdiOrderLinePK ediOrderLinePK) {
        if ( ediOrderLinePK == null ) {
            return null;
        }

        EdiShipInfoLnPK ediShipInfoLnPK = new EdiShipInfoLnPK();

        return ediShipInfoLnPK;
    }

    protected EdiShipInfoLn ediOrderLineToEdiShipInfoLn(EdiOrderLine ediOrderLine) {
        if ( ediOrderLine == null ) {
            return null;
        }

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
        }
        ediShipInfoLn.setUpcCode( ediOrderLine.getUpcCode() );

        return ediShipInfoLn;
    }

    protected List<EdiShipInfoLn> ediOrderLineListToEdiShipInfoLnList(List<EdiOrderLine> list) {
        if ( list == null ) {
            return null;
        }

        List<EdiShipInfoLn> list1 = new ArrayList<EdiShipInfoLn>( list.size() );
        for ( EdiOrderLine ediOrderLine : list ) {
            list1.add( ediOrderLineToEdiShipInfoLn( ediOrderLine ) );
        }

        return list1;
    }

    protected EdiShipInfoLnPK ediLineToEdiShipInfoLnPK(EdiLine ediLine) {
        if ( ediLine == null ) {
            return null;
        }

        EdiShipInfoLnPK ediShipInfoLnPK = new EdiShipInfoLnPK();

        ediShipInfoLnPK.setLineNbr( ediLine.getLineNbr() );

        return ediShipInfoLnPK;
    }
}
