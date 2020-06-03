package com.shaw.ediorderservices.mapping;

import com.shaw.ediorderservices.csws.CustInfo;
import com.shaw.ediorderservices.csws.ShipInfo;
import com.shaw.ediorderservices.factory.EdiOrderFactory;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderDate;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderHeader;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderLine;
import com.shaw.ediorderservices.persistance.db2.entity.LegacyConsumerAddress;
import com.shaw.ediorderservices.persistance.db2.entity.LegacyThirdPartyAddress;
import com.shaw.ediorderservices.persistance.sqlserver.entity.CancelDate;
import com.shaw.ediorderservices.persistance.sqlserver.entity.CarpetEdiOrder;
import com.shaw.ediorderservices.persistance.sqlserver.entity.ConsumerAddress;
import com.shaw.ediorderservices.persistance.sqlserver.entity.EdiLine;
import com.shaw.ediorderservices.persistance.sqlserver.entity.EdiOrder;
import com.shaw.ediorderservices.persistance.sqlserver.entity.GenericDate;
import com.shaw.ediorderservices.persistance.sqlserver.entity.HardsurfacesEdiOrder;
import com.shaw.ediorderservices.persistance.sqlserver.entity.PoDate;
import com.shaw.ediorderservices.persistance.sqlserver.entity.SamplesEdiOrder;
import com.shaw.ediorderservices.persistance.sqlserver.entity.ShipDate;
import com.shaw.ediorderservices.persistance.sqlserver.entity.ShipToAddress;
import com.shaw.ediorderservices.persistance.sqlserver.entity.ThirdPartyAddress;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-06-03T10:37:34-0400",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 3.21.0.v20200304-1404, environment: Java 14.0.1 (Oracle Corporation)"
)
@Component
public class OrderMapperImpl implements OrderMapper {

    @Autowired
    private EdiOrderFactory ediOrderFactory;
    @Autowired
    private LineMapper lineMapper;
    @Autowired
    private DateMapper dateMapper;
    @Autowired
    private AddressMapper addressMapper;

    @Override
    public EdiOrderHeader ediOrderToLegacy(EdiOrder ediOrder) {
        if ( ediOrder == null ) {
            return null;
        }

        EdiOrderHeader ediOrderHeader = new EdiOrderHeader();

        ediOrderHeader.setCancelDateQualifier( ediOrderCancelDateQualifier( ediOrder ) );
        ediOrderHeader.setOhCancelDateValue( ediOrderCancelDateDateValue( ediOrder ) );
        ediOrderHeader.setShipDateValue( ediOrderShipDateDateValue( ediOrder ) );
        ediOrderHeader.setPoDateQualifier( ediOrderPoDateQualifier( ediOrder ) );
        ediOrderHeader.setPoDateValue( ediOrderPoDateDateValue( ediOrder ) );
        ediOrderHeader.setShipDateQualifier( ediOrderShipDateQualifier( ediOrder ) );
        ediOrderHeader.setAgreementNumber( ediOrder.getAgreementNumber() );
        ediOrderHeader.setBeg( ediOrder.getBeg() );
        ediOrderHeader.setBillToStore( ediOrder.getBillToStore() );
        ediOrderHeader.setCarrierCode( ediOrder.getCarrierCode() );
        ediOrderHeader.setCommCust( ediOrder.getCommCust() );
        ediOrderHeader.setConsumerAddress( addressMapper.consumerAddressToLegacyConsumerAddress( ediOrder.getConsumerAddress() ) );
        ediOrderHeader.setCustDept( ediOrder.getCustDept() );
        ediOrderHeader.setCustomerCode( ediOrder.getCustomerCode() );
        ediOrderHeader.setDunsNbr( ediOrder.getDunsNbr() );
        ediOrderHeader.setNbDate( ediOrder.getNbDate() );
        ediOrderHeader.setOrderingSystem( ediOrder.getOrderingSystem() );
        ediOrderHeader.setPoNumber( ediOrder.getPoNumber() );
        ediOrderHeader.setShipByDate( ediOrder.getShipByDate() );
        ediOrderHeader.setShipCancelDate( ediOrder.getShipCancelDate() );
        ediOrderHeader.setShipToAddress( addressMapper.shipToAddressToLegacyShipToAddress( ediOrder.getShipToAddress() ) );
        ediOrderHeader.setStoreName( ediOrder.getStoreName() );
        ediOrderHeader.setThirdPartyAddress( addressMapper.thirdPartyAddressToLegacyThirdPartyAddress( ediOrder.getThirdPartyAddress() ) );
        ediOrderHeader.setVendorNo( ediOrder.getVendorNo() );
        if ( ediOrderHeader.getDates() != null ) {
            List<EdiOrderDate> list = genericDateListToEdiOrderDateList( ediOrder.getDates() );
            if ( list != null ) {
                ediOrderHeader.getDates().addAll( list );
            }
        }
        if ( ediOrderHeader.getLines() != null ) {
            List<EdiOrderLine> list1 = ediLineListToEdiOrderLineList( ediOrder.getLines() );
            if ( list1 != null ) {
                ediOrderHeader.getLines().addAll( list1 );
            }
        }

        ediOrderHeader.setOrderType( ediOrder.getOrderType().substring(0,1) );

        return ediOrderHeader;
    }

    @Override
    public SamplesEdiOrder legacyHeaderToSamplesEdiOrder(EdiOrderHeader header) {
        if ( header == null ) {
            return null;
        }

        SamplesEdiOrder samplesEdiOrder = ediOrderFactory.createMapperInstance( header, SamplesEdiOrder.class );

        samplesEdiOrder.setLegacyId( header.getLegacyOrderNumber() );
        samplesEdiOrder.setAgreementNumber( header.getAgreementNumber() );
        samplesEdiOrder.setBeg( header.getBeg() );
        samplesEdiOrder.setBillToStore( header.getBillToStore() );
        samplesEdiOrder.setCarrierCode( header.getCarrierCode() );
        samplesEdiOrder.setCommCust( header.getCommCust() );
        samplesEdiOrder.setConsumerAddress( legacyConsumerAddressToConsumerAddress( header.getConsumerAddress() ) );
        samplesEdiOrder.setCustDept( header.getCustDept() );
        samplesEdiOrder.setCustomerCode( header.getCustomerCode() );
        samplesEdiOrder.setDates( ediOrderDateListToGenericDateList( header.getDates() ) );
        samplesEdiOrder.setDunsNbr( header.getDunsNbr() );
        samplesEdiOrder.setLines( ediOrderLineListToEdiLineList( header.getLines() ) );
        samplesEdiOrder.setNbDate( header.getNbDate() );
        samplesEdiOrder.setOrderType( header.getOrderType() );
        samplesEdiOrder.setOrderingSystem( header.getOrderingSystem() );
        samplesEdiOrder.setPoNumber( header.getPoNumber() );
        samplesEdiOrder.setShipByDate( header.getShipByDate() );
        samplesEdiOrder.setShipCancelDate( header.getShipCancelDate() );
        samplesEdiOrder.setShipToAddress( addressMapper.legacyShipToAddressToShipToAddress( header.getShipToAddress() ) );
        samplesEdiOrder.setStoreName( header.getStoreName() );
        samplesEdiOrder.setThirdPartyAddress( legacyThirdPartyAddressToThirdPartyAddress( header.getThirdPartyAddress() ) );
        samplesEdiOrder.setVendorNo( header.getVendorNo() );

        samplesEdiOrder.setCancelDate( new com.shaw.ediorderservices.persistance.sqlserver.entity.CancelDate(header.getCancelDateQualifier(), header.getOhCancelDateValue()) );
        samplesEdiOrder.setPoDate( new com.shaw.ediorderservices.persistance.sqlserver.entity.PoDate(header.getPoDateQualifier(), header.getPoDateValue()) );
        samplesEdiOrder.setId( (long) 0L );
        samplesEdiOrder.setShipDate( new com.shaw.ediorderservices.persistance.sqlserver.entity.ShipDate(header.getShipDateQualifier(), header.getShipDateValue()) );

        return samplesEdiOrder;
    }

    @Override
    public CarpetEdiOrder legacyHeaderToCarpetEdiOrder(EdiOrderHeader header) {
        if ( header == null ) {
            return null;
        }

        CarpetEdiOrder carpetEdiOrder = ediOrderFactory.createMapperInstance( header, CarpetEdiOrder.class );

        carpetEdiOrder.setLegacyId( header.getLegacyOrderNumber() );
        carpetEdiOrder.setAgreementNumber( header.getAgreementNumber() );
        carpetEdiOrder.setBeg( header.getBeg() );
        carpetEdiOrder.setBillToStore( header.getBillToStore() );
        carpetEdiOrder.setCarrierCode( header.getCarrierCode() );
        carpetEdiOrder.setCommCust( header.getCommCust() );
        carpetEdiOrder.setConsumerAddress( legacyConsumerAddressToConsumerAddress( header.getConsumerAddress() ) );
        carpetEdiOrder.setCustDept( header.getCustDept() );
        carpetEdiOrder.setCustomerCode( header.getCustomerCode() );
        carpetEdiOrder.setDates( ediOrderDateListToGenericDateList( header.getDates() ) );
        carpetEdiOrder.setDunsNbr( header.getDunsNbr() );
        carpetEdiOrder.setLines( ediOrderLineListToEdiLineList1( header.getLines() ) );
        carpetEdiOrder.setNbDate( header.getNbDate() );
        carpetEdiOrder.setOrderType( header.getOrderType() );
        carpetEdiOrder.setOrderingSystem( header.getOrderingSystem() );
        carpetEdiOrder.setPoNumber( header.getPoNumber() );
        carpetEdiOrder.setShipByDate( header.getShipByDate() );
        carpetEdiOrder.setShipCancelDate( header.getShipCancelDate() );
        carpetEdiOrder.setShipToAddress( addressMapper.legacyShipToAddressToShipToAddress( header.getShipToAddress() ) );
        carpetEdiOrder.setStoreName( header.getStoreName() );
        carpetEdiOrder.setThirdPartyAddress( legacyThirdPartyAddressToThirdPartyAddress( header.getThirdPartyAddress() ) );
        carpetEdiOrder.setVendorNo( header.getVendorNo() );
        carpetEdiOrder.setAuthorizationNo( header.getAuthorizationNo() );
        carpetEdiOrder.setDeliveryDate( header.getDeliveryDate() );
        carpetEdiOrder.setFobPoint( header.getFobPoint() );
        carpetEdiOrder.setHostAlertFlag( header.getHostAlertFlag() );
        carpetEdiOrder.setMarkForStore( header.getMarkForStore() );
        carpetEdiOrder.setNewStoreInd( header.getNewStoreInd() );
        carpetEdiOrder.setNoAsnFlag( header.getNoAsnFlag() );
        carpetEdiOrder.setReserveOrderInd( header.getReserveOrderInd() );
        carpetEdiOrder.setRouteByDate( header.getRouteByDate() );
        carpetEdiOrder.setSalesCheckNumber( header.getSalesCheckNumber() );
        carpetEdiOrder.setShipPartCompInd( header.getShipPartCompInd() );

        carpetEdiOrder.setCancelDate( new com.shaw.ediorderservices.persistance.sqlserver.entity.CancelDate(header.getCancelDateQualifier(), header.getOhCancelDateValue()) );
        carpetEdiOrder.setPoDate( new com.shaw.ediorderservices.persistance.sqlserver.entity.PoDate(header.getPoDateQualifier(), header.getPoDateValue()) );
        carpetEdiOrder.setId( (long) 0L );
        carpetEdiOrder.setShipDate( new com.shaw.ediorderservices.persistance.sqlserver.entity.ShipDate(header.getShipDateQualifier(), header.getShipDateValue()) );

        return carpetEdiOrder;
    }

    @Override
    public HardsurfacesEdiOrder legacyHeaderToHardsurfacesEdiOrder(EdiOrderHeader header) {
        if ( header == null ) {
            return null;
        }

        HardsurfacesEdiOrder hardsurfacesEdiOrder = ediOrderFactory.createMapperInstance( header, HardsurfacesEdiOrder.class );

        hardsurfacesEdiOrder.setLegacyId( header.getLegacyOrderNumber() );
        hardsurfacesEdiOrder.setAgreementNumber( header.getAgreementNumber() );
        hardsurfacesEdiOrder.setBeg( header.getBeg() );
        hardsurfacesEdiOrder.setBillToStore( header.getBillToStore() );
        hardsurfacesEdiOrder.setCarrierCode( header.getCarrierCode() );
        hardsurfacesEdiOrder.setCommCust( header.getCommCust() );
        hardsurfacesEdiOrder.setConsumerAddress( legacyConsumerAddressToConsumerAddress( header.getConsumerAddress() ) );
        hardsurfacesEdiOrder.setCustDept( header.getCustDept() );
        hardsurfacesEdiOrder.setCustomerCode( header.getCustomerCode() );
        hardsurfacesEdiOrder.setDates( ediOrderDateListToGenericDateList( header.getDates() ) );
        hardsurfacesEdiOrder.setDunsNbr( header.getDunsNbr() );
        hardsurfacesEdiOrder.setLines( ediOrderLineListToEdiLineList2( header.getLines() ) );
        hardsurfacesEdiOrder.setNbDate( header.getNbDate() );
        hardsurfacesEdiOrder.setOrderType( header.getOrderType() );
        hardsurfacesEdiOrder.setOrderingSystem( header.getOrderingSystem() );
        hardsurfacesEdiOrder.setPoNumber( header.getPoNumber() );
        hardsurfacesEdiOrder.setShipByDate( header.getShipByDate() );
        hardsurfacesEdiOrder.setShipCancelDate( header.getShipCancelDate() );
        hardsurfacesEdiOrder.setShipToAddress( addressMapper.legacyShipToAddressToShipToAddress( header.getShipToAddress() ) );
        hardsurfacesEdiOrder.setStoreName( header.getStoreName() );
        hardsurfacesEdiOrder.setThirdPartyAddress( legacyThirdPartyAddressToThirdPartyAddress( header.getThirdPartyAddress() ) );
        hardsurfacesEdiOrder.setVendorNo( header.getVendorNo() );
        hardsurfacesEdiOrder.setAuthorizationNo( header.getAuthorizationNo() );
        hardsurfacesEdiOrder.setDeliveryDate( header.getDeliveryDate() );
        hardsurfacesEdiOrder.setFobPoint( header.getFobPoint() );
        hardsurfacesEdiOrder.setHostAlertFlag( header.getHostAlertFlag() );
        hardsurfacesEdiOrder.setMarkForStore( header.getMarkForStore() );
        hardsurfacesEdiOrder.setNewStoreInd( header.getNewStoreInd() );
        hardsurfacesEdiOrder.setNoAsnFlag( header.getNoAsnFlag() );
        hardsurfacesEdiOrder.setReserveOrderInd( header.getReserveOrderInd() );
        hardsurfacesEdiOrder.setRouteByDate( header.getRouteByDate() );
        hardsurfacesEdiOrder.setSalesCheckNumber( header.getSalesCheckNumber() );
        hardsurfacesEdiOrder.setShipPartCompInd( header.getShipPartCompInd() );

        hardsurfacesEdiOrder.setCancelDate( new com.shaw.ediorderservices.persistance.sqlserver.entity.CancelDate(header.getCancelDateQualifier(), header.getOhCancelDateValue()) );
        hardsurfacesEdiOrder.setPoDate( new com.shaw.ediorderservices.persistance.sqlserver.entity.PoDate(header.getPoDateQualifier(), header.getPoDateValue()) );
        hardsurfacesEdiOrder.setId( (long) 0L );
        hardsurfacesEdiOrder.setShipDate( new com.shaw.ediorderservices.persistance.sqlserver.entity.ShipDate(header.getShipDateQualifier(), header.getShipDateValue()) );

        return hardsurfacesEdiOrder;
    }

    @Override
    public ShipInfo ediOrderAndCustInfoToShipInfo(EdiOrder ediOrder, CustInfo custInfo) {
        if ( ediOrder == null && custInfo == null ) {
            return null;
        }

        ShipInfo shipInfo = new ShipInfo();

        if ( ediOrder != null ) {
            LocalDate dateValue = ediOrderShipDateDateValue( ediOrder );
            if ( dateValue != null ) {
                shipInfo.setShipDate( DateTimeFormatter.ISO_LOCAL_DATE.format( dateValue ) );
            }
            shipInfo.setShipCountry( ediOrderShipToAddressCountry( ediOrder ) );
            shipInfo.setDestCountry( ediOrderShipToAddressCountry( ediOrder ) );
            shipInfo.setFreightType( ediOrder.getFreightType() );
            shipInfo.setOrderType( ediOrder.getOrderType() );
            shipInfo.setServiceCode( ediOrder.getServiceCode() );
        }
        if ( custInfo != null ) {
            shipInfo.setCustNbr( custInfo.getCustNbr() );
            shipInfo.setDistrict( custInfo.getDistrict() );
            shipInfo.setRegion( custInfo.getRegion() );
            shipInfo.setSpecialInst1( custInfo.getSpecialInst1() );
            shipInfo.setSpecialInst2( custInfo.getSpecialInst2() );
            shipInfo.setSpecialInst3( custInfo.getSpecialInst3() );
            shipInfo.setSpecialInst4( custInfo.getSpecialInst4() );
            shipInfo.setTerritory( custInfo.getTerritory() );
        }
        shipInfo.setHeaderSidemarkCode1( "S" );
        shipInfo.setHeaderSidemarkCode2( "S" );
        shipInfo.setShipCityI( "" );
        shipInfo.setShipZip( shipInfo.getDestCountry().equals("US")?ediOrder.getShipToAddress().getZip().substring(0,5):ediOrder.getShipToAddress().getZip() );
        shipInfo.setShipStateI( "" );
        shipInfo.setRequestedBy( "EDIS" );
        shipInfo.setHsmChargeCode2( "99" );
        shipInfo.setHsmChargeCode1( "99" );
        shipInfo.setShipZipI( "" );
        shipInfo.setShipName2( "" );
        shipInfo.setResDelvFlag( false );

        return shipInfo;
    }

    private String ediOrderCancelDateQualifier(EdiOrder ediOrder) {
        if ( ediOrder == null ) {
            return null;
        }
        CancelDate cancelDate = ediOrder.getCancelDate();
        if ( cancelDate == null ) {
            return null;
        }
        String qualifier = cancelDate.getQualifier();
        if ( qualifier == null ) {
            return null;
        }
        return qualifier;
    }

    private LocalDate ediOrderCancelDateDateValue(EdiOrder ediOrder) {
        if ( ediOrder == null ) {
            return null;
        }
        CancelDate cancelDate = ediOrder.getCancelDate();
        if ( cancelDate == null ) {
            return null;
        }
        LocalDate dateValue = cancelDate.getDateValue();
        if ( dateValue == null ) {
            return null;
        }
        return dateValue;
    }

    private LocalDate ediOrderShipDateDateValue(EdiOrder ediOrder) {
        if ( ediOrder == null ) {
            return null;
        }
        ShipDate shipDate = ediOrder.getShipDate();
        if ( shipDate == null ) {
            return null;
        }
        LocalDate dateValue = shipDate.getDateValue();
        if ( dateValue == null ) {
            return null;
        }
        return dateValue;
    }

    private String ediOrderPoDateQualifier(EdiOrder ediOrder) {
        if ( ediOrder == null ) {
            return null;
        }
        PoDate poDate = ediOrder.getPoDate();
        if ( poDate == null ) {
            return null;
        }
        String qualifier = poDate.getQualifier();
        if ( qualifier == null ) {
            return null;
        }
        return qualifier;
    }

    private LocalDate ediOrderPoDateDateValue(EdiOrder ediOrder) {
        if ( ediOrder == null ) {
            return null;
        }
        PoDate poDate = ediOrder.getPoDate();
        if ( poDate == null ) {
            return null;
        }
        LocalDate dateValue = poDate.getDateValue();
        if ( dateValue == null ) {
            return null;
        }
        return dateValue;
    }

    private String ediOrderShipDateQualifier(EdiOrder ediOrder) {
        if ( ediOrder == null ) {
            return null;
        }
        ShipDate shipDate = ediOrder.getShipDate();
        if ( shipDate == null ) {
            return null;
        }
        String qualifier = shipDate.getQualifier();
        if ( qualifier == null ) {
            return null;
        }
        return qualifier;
    }

    protected List<EdiOrderDate> genericDateListToEdiOrderDateList(List<GenericDate> list) {
        if ( list == null ) {
            return null;
        }

        List<EdiOrderDate> list1 = new ArrayList<EdiOrderDate>( list.size() );
        for ( GenericDate genericDate : list ) {
            list1.add( dateMapper.ediDateToLegacy( genericDate ) );
        }

        return list1;
    }

    protected EdiOrderLine ediLineToEdiOrderLine(EdiLine ediLine) {
        if ( ediLine == null ) {
            return null;
        }

        EdiOrderLine ediOrderLine = new EdiOrderLine();

        ediOrderLine.setCustReqShipDate( ediLine.getCustReqShipDate() );
        ediOrderLine.setColor( ediLine.getColor() );
        ediOrderLine.setStyle( ediLine.getStyle() );

        return ediOrderLine;
    }

    protected List<EdiOrderLine> ediLineListToEdiOrderLineList(List<EdiLine> list) {
        if ( list == null ) {
            return null;
        }

        List<EdiOrderLine> list1 = new ArrayList<EdiOrderLine>( list.size() );
        for ( EdiLine ediLine : list ) {
            list1.add( ediLineToEdiOrderLine( ediLine ) );
        }

        return list1;
    }

    protected ConsumerAddress legacyConsumerAddressToConsumerAddress(LegacyConsumerAddress legacyConsumerAddress) {
        if ( legacyConsumerAddress == null ) {
            return null;
        }

        ConsumerAddress consumerAddress = new ConsumerAddress();

        consumerAddress.setAddressLine1( legacyConsumerAddress.getAddressLine1() );
        consumerAddress.setAddressLine2( legacyConsumerAddress.getAddressLine2() );
        consumerAddress.setCity( legacyConsumerAddress.getCity() );
        consumerAddress.setName( legacyConsumerAddress.getName() );
        consumerAddress.setState( legacyConsumerAddress.getState() );
        consumerAddress.setZip( legacyConsumerAddress.getZip() );

        return consumerAddress;
    }

    protected List<GenericDate> ediOrderDateListToGenericDateList(List<EdiOrderDate> list) {
        if ( list == null ) {
            return null;
        }

        List<GenericDate> list1 = new ArrayList<GenericDate>( list.size() );
        for ( EdiOrderDate ediOrderDate : list ) {
            list1.add( dateMapper.legacyDateToEdiDate( ediOrderDate ) );
        }

        return list1;
    }

    protected List<EdiLine> ediOrderLineListToEdiLineList(List<EdiOrderLine> list) {
        if ( list == null ) {
            return null;
        }

        List<EdiLine> list1 = new ArrayList<EdiLine>( list.size() );
        for ( EdiOrderLine ediOrderLine : list ) {
            list1.add( lineMapper.legacyLineToSamplesEdiLine( ediOrderLine ) );
        }

        return list1;
    }

    protected ThirdPartyAddress legacyThirdPartyAddressToThirdPartyAddress(LegacyThirdPartyAddress legacyThirdPartyAddress) {
        if ( legacyThirdPartyAddress == null ) {
            return null;
        }

        ThirdPartyAddress thirdPartyAddress = new ThirdPartyAddress();

        thirdPartyAddress.setAddressLine1( legacyThirdPartyAddress.getAddressLine1() );
        thirdPartyAddress.setAddressLine2( legacyThirdPartyAddress.getAddressLine2() );
        thirdPartyAddress.setCity( legacyThirdPartyAddress.getCity() );
        thirdPartyAddress.setName( legacyThirdPartyAddress.getName() );
        thirdPartyAddress.setState( legacyThirdPartyAddress.getState() );
        thirdPartyAddress.setZip( legacyThirdPartyAddress.getZip() );
        thirdPartyAddress.setAccountNbr( legacyThirdPartyAddress.getAccountNbr() );
        thirdPartyAddress.setBillFlag( legacyThirdPartyAddress.getBillFlag() );

        return thirdPartyAddress;
    }

    protected List<EdiLine> ediOrderLineListToEdiLineList1(List<EdiOrderLine> list) {
        if ( list == null ) {
            return null;
        }

        List<EdiLine> list1 = new ArrayList<EdiLine>( list.size() );
        for ( EdiOrderLine ediOrderLine : list ) {
            list1.add( lineMapper.legacyLineToCarpetEdiLine( ediOrderLine ) );
        }

        return list1;
    }

    protected List<EdiLine> ediOrderLineListToEdiLineList2(List<EdiOrderLine> list) {
        if ( list == null ) {
            return null;
        }

        List<EdiLine> list1 = new ArrayList<EdiLine>( list.size() );
        for ( EdiOrderLine ediOrderLine : list ) {
            list1.add( lineMapper.legacyLineToHardsurfacesEdiLine( ediOrderLine ) );
        }

        return list1;
    }

    private String ediOrderShipToAddressCountry(EdiOrder ediOrder) {
        if ( ediOrder == null ) {
            return null;
        }
        ShipToAddress shipToAddress = ediOrder.getShipToAddress();
        if ( shipToAddress == null ) {
            return null;
        }
        String country = shipToAddress.getCountry();
        if ( country == null ) {
            return null;
        }
        return country;
    }
}
