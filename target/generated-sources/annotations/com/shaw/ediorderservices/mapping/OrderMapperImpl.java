package com.shaw.ediorderservices.mapping;

import com.shaw.ediorderservices.csws.CustInfo;
import com.shaw.ediorderservices.csws.ShipInfo;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderDate;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderHeader;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderLine;
import com.shaw.ediorderservices.persistance.db2.entity.LegacyConsumerAddress;
import com.shaw.ediorderservices.persistance.db2.entity.LegacyThirdPartyAddress;
import com.shaw.ediorderservices.persistance.sqlserver.entity.address.ConsumerAddress;
import com.shaw.ediorderservices.persistance.sqlserver.entity.address.ShipToAddress;
import com.shaw.ediorderservices.persistance.sqlserver.entity.address.ThirdPartyAddress;
import com.shaw.ediorderservices.persistance.sqlserver.entity.date.CancelDate;
import com.shaw.ediorderservices.persistance.sqlserver.entity.date.GenericDate;
import com.shaw.ediorderservices.persistance.sqlserver.entity.date.PoDate;
import com.shaw.ediorderservices.persistance.sqlserver.entity.date.ShipDate;
import com.shaw.ediorderservices.persistance.sqlserver.entity.line.EdiLine;
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.CarpetEdiOrder;
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.EdiOrder;
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.EdiOrderFactory;
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.HardsurfacesEdiOrder;
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.SamplesEdiOrder;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-06-09T08:49:54-0400",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 3.20.0.v20191203-2131, environment: Java 1.8.0_241 (Oracle Corporation)"
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
        ediOrderHeader.setCustDept( ediOrder.getCustDept() );
        ediOrderHeader.setCustomerCode( ediOrder.getCustomerCode() );
        ediOrderHeader.setDunsNbr( ediOrder.getDunsNbr() );
        ediOrderHeader.setNbDate( ediOrder.getNbDate() );
        ediOrderHeader.setOrderingSystem( ediOrder.getOrderingSystem() );
        ediOrderHeader.setPoNumber( ediOrder.getPoNumber() );
        ediOrderHeader.setShipByDate( ediOrder.getShipByDate() );
        ediOrderHeader.setShipCancelDate( ediOrder.getShipCancelDate() );
        ediOrderHeader.setStoreName( ediOrder.getStoreName() );
        ediOrderHeader.setVendorNo( ediOrder.getVendorNo() );
        ediOrderHeader.setConsumerAddress( addressMapper.consumerAddressToLegacyConsumerAddress( ediOrder.getConsumerAddress() ) );
        ediOrderHeader.setShipToAddress( addressMapper.shipToAddressToLegacyShipToAddress( ediOrder.getShipToAddress() ) );
        ediOrderHeader.setThirdPartyAddress( addressMapper.thirdPartyAddressToLegacyThirdPartyAddress( ediOrder.getThirdPartyAddress() ) );
        if ( ediOrderHeader.getDates() != null ) {
            List<EdiOrderDate> list = genericDateListToEdiOrderDateList( ediOrder.getDates() );
            if ( list != null ) {
                ediOrderHeader.getDates().addAll( list );
            }
        }

        ediOrderHeader.setOrderType( ediOrder.getOrderType().substring(0,1) );
        ediOrderHeader.setLines( ediOrder.getLines().stream().map(lineMapper::ediLineToLegacy).collect(java.util.stream.Collectors.toList()) );

        return ediOrderHeader;
    }

    @Override
    public SamplesEdiOrder legacyHeaderToSamplesEdiOrder(EdiOrderHeader header) {
        if ( header == null ) {
            return null;
        }

        SamplesEdiOrder samplesEdiOrder = ediOrderFactory.createMapperInstance( header, SamplesEdiOrder.class );

        samplesEdiOrder.setCustomerCode( header.getCustomerCode() );
        samplesEdiOrder.setOrderingSystem( header.getOrderingSystem() );
        samplesEdiOrder.setOrderType( header.getOrderType() );
        samplesEdiOrder.setLegacyOrderNumber( header.getLegacyOrderNumber() );
        samplesEdiOrder.setCarrierCode( header.getCarrierCode() );
        samplesEdiOrder.setCommCust( header.getCommCust() );
        samplesEdiOrder.setPoNumber( header.getPoNumber() );
        samplesEdiOrder.setBillToStore( header.getBillToStore() );
        samplesEdiOrder.setAgreementNumber( header.getAgreementNumber() );
        samplesEdiOrder.setCustDept( header.getCustDept() );
        samplesEdiOrder.setStoreName( header.getStoreName() );
        samplesEdiOrder.setVendorNo( header.getVendorNo() );
        samplesEdiOrder.setDunsNbr( header.getDunsNbr() );
        samplesEdiOrder.setBeg( header.getBeg() );
        samplesEdiOrder.setShipCancelDate( header.getShipCancelDate() );
        samplesEdiOrder.setShipByDate( header.getShipByDate() );
        samplesEdiOrder.setNbDate( header.getNbDate() );
        samplesEdiOrder.setShipToAddress( addressMapper.legacyShipToAddressToShipToAddress( header.getShipToAddress() ) );
        samplesEdiOrder.setConsumerAddress( legacyConsumerAddressToConsumerAddress( header.getConsumerAddress() ) );
        samplesEdiOrder.setThirdPartyAddress( legacyThirdPartyAddressToThirdPartyAddress( header.getThirdPartyAddress() ) );
        samplesEdiOrder.setDates( ediOrderDateListToGenericDateList( header.getDates() ) );
        samplesEdiOrder.setLines( ediOrderLineListToEdiLineList( header.getLines() ) );

        samplesEdiOrder.setCancelDate( new CancelDate(header.getCancelDateQualifier(), header.getOhCancelDateValue()) );
        samplesEdiOrder.setId( (long) 0L );
        samplesEdiOrder.setShipDate( new ShipDate(header.getShipDateQualifier(), header.getShipDateValue()) );
        samplesEdiOrder.setPoDate( new PoDate(header.getPoDateQualifier(), header.getPoDateValue()) );

        return samplesEdiOrder;
    }

    @Override
    public CarpetEdiOrder legacyHeaderToCarpetEdiOrder(EdiOrderHeader header) {
        if ( header == null ) {
            return null;
        }

        CarpetEdiOrder carpetEdiOrder = ediOrderFactory.createMapperInstance( header, CarpetEdiOrder.class );

        carpetEdiOrder.setCustomerCode( header.getCustomerCode() );
        carpetEdiOrder.setOrderingSystem( header.getOrderingSystem() );
        carpetEdiOrder.setOrderType( header.getOrderType() );
        carpetEdiOrder.setLegacyOrderNumber( header.getLegacyOrderNumber() );
        carpetEdiOrder.setCarrierCode( header.getCarrierCode() );
        carpetEdiOrder.setCommCust( header.getCommCust() );
        carpetEdiOrder.setPoNumber( header.getPoNumber() );
        carpetEdiOrder.setBillToStore( header.getBillToStore() );
        carpetEdiOrder.setAgreementNumber( header.getAgreementNumber() );
        carpetEdiOrder.setCustDept( header.getCustDept() );
        carpetEdiOrder.setStoreName( header.getStoreName() );
        carpetEdiOrder.setVendorNo( header.getVendorNo() );
        carpetEdiOrder.setDunsNbr( header.getDunsNbr() );
        carpetEdiOrder.setBeg( header.getBeg() );
        carpetEdiOrder.setShipCancelDate( header.getShipCancelDate() );
        carpetEdiOrder.setShipByDate( header.getShipByDate() );
        carpetEdiOrder.setNbDate( header.getNbDate() );
        carpetEdiOrder.setShipToAddress( addressMapper.legacyShipToAddressToShipToAddress( header.getShipToAddress() ) );
        carpetEdiOrder.setConsumerAddress( legacyConsumerAddressToConsumerAddress( header.getConsumerAddress() ) );
        carpetEdiOrder.setThirdPartyAddress( legacyThirdPartyAddressToThirdPartyAddress( header.getThirdPartyAddress() ) );
        carpetEdiOrder.setDates( ediOrderDateListToGenericDateList( header.getDates() ) );
        carpetEdiOrder.setLines( ediOrderLineListToEdiLineList1( header.getLines() ) );
        carpetEdiOrder.setSalesCheckNumber( header.getSalesCheckNumber() );
        carpetEdiOrder.setNewStoreInd( header.getNewStoreInd() );
        carpetEdiOrder.setHostAlertFlag( header.getHostAlertFlag() );
        carpetEdiOrder.setFobPoint( header.getFobPoint() );
        carpetEdiOrder.setShipPartCompInd( header.getShipPartCompInd() );
        carpetEdiOrder.setReserveOrderInd( header.getReserveOrderInd() );
        carpetEdiOrder.setAuthorizationNo( header.getAuthorizationNo() );
        carpetEdiOrder.setNoAsnFlag( header.getNoAsnFlag() );
        carpetEdiOrder.setMarkForStore( header.getMarkForStore() );
        carpetEdiOrder.setDeliveryDate( header.getDeliveryDate() );
        carpetEdiOrder.setRouteByDate( header.getRouteByDate() );

        carpetEdiOrder.setCancelDate( new CancelDate(header.getCancelDateQualifier(), header.getOhCancelDateValue()) );
        carpetEdiOrder.setId( (long) 0L );
        carpetEdiOrder.setShipDate( new ShipDate(header.getShipDateQualifier(), header.getShipDateValue()) );
        carpetEdiOrder.setPoDate( new PoDate(header.getPoDateQualifier(), header.getPoDateValue()) );

        return carpetEdiOrder;
    }

    @Override
    public HardsurfacesEdiOrder legacyHeaderToHardsurfacesEdiOrder(EdiOrderHeader header) {
        if ( header == null ) {
            return null;
        }

        HardsurfacesEdiOrder hardsurfacesEdiOrder = ediOrderFactory.createMapperInstance( header, HardsurfacesEdiOrder.class );

        hardsurfacesEdiOrder.setCustomerCode( header.getCustomerCode() );
        hardsurfacesEdiOrder.setOrderingSystem( header.getOrderingSystem() );
        hardsurfacesEdiOrder.setOrderType( header.getOrderType() );
        hardsurfacesEdiOrder.setLegacyOrderNumber( header.getLegacyOrderNumber() );
        hardsurfacesEdiOrder.setCarrierCode( header.getCarrierCode() );
        hardsurfacesEdiOrder.setCommCust( header.getCommCust() );
        hardsurfacesEdiOrder.setPoNumber( header.getPoNumber() );
        hardsurfacesEdiOrder.setBillToStore( header.getBillToStore() );
        hardsurfacesEdiOrder.setAgreementNumber( header.getAgreementNumber() );
        hardsurfacesEdiOrder.setCustDept( header.getCustDept() );
        hardsurfacesEdiOrder.setStoreName( header.getStoreName() );
        hardsurfacesEdiOrder.setVendorNo( header.getVendorNo() );
        hardsurfacesEdiOrder.setDunsNbr( header.getDunsNbr() );
        hardsurfacesEdiOrder.setBeg( header.getBeg() );
        hardsurfacesEdiOrder.setShipCancelDate( header.getShipCancelDate() );
        hardsurfacesEdiOrder.setShipByDate( header.getShipByDate() );
        hardsurfacesEdiOrder.setNbDate( header.getNbDate() );
        hardsurfacesEdiOrder.setShipToAddress( addressMapper.legacyShipToAddressToShipToAddress( header.getShipToAddress() ) );
        hardsurfacesEdiOrder.setConsumerAddress( legacyConsumerAddressToConsumerAddress( header.getConsumerAddress() ) );
        hardsurfacesEdiOrder.setThirdPartyAddress( legacyThirdPartyAddressToThirdPartyAddress( header.getThirdPartyAddress() ) );
        hardsurfacesEdiOrder.setDates( ediOrderDateListToGenericDateList( header.getDates() ) );
        hardsurfacesEdiOrder.setLines( ediOrderLineListToEdiLineList2( header.getLines() ) );
        hardsurfacesEdiOrder.setSalesCheckNumber( header.getSalesCheckNumber() );
        hardsurfacesEdiOrder.setNewStoreInd( header.getNewStoreInd() );
        hardsurfacesEdiOrder.setHostAlertFlag( header.getHostAlertFlag() );
        hardsurfacesEdiOrder.setFobPoint( header.getFobPoint() );
        hardsurfacesEdiOrder.setShipPartCompInd( header.getShipPartCompInd() );
        hardsurfacesEdiOrder.setReserveOrderInd( header.getReserveOrderInd() );
        hardsurfacesEdiOrder.setAuthorizationNo( header.getAuthorizationNo() );
        hardsurfacesEdiOrder.setNoAsnFlag( header.getNoAsnFlag() );
        hardsurfacesEdiOrder.setMarkForStore( header.getMarkForStore() );
        hardsurfacesEdiOrder.setDeliveryDate( header.getDeliveryDate() );
        hardsurfacesEdiOrder.setRouteByDate( header.getRouteByDate() );

        hardsurfacesEdiOrder.setCancelDate( new CancelDate(header.getCancelDateQualifier(), header.getOhCancelDateValue()) );
        hardsurfacesEdiOrder.setId( (long) 0L );
        hardsurfacesEdiOrder.setShipDate( new ShipDate(header.getShipDateQualifier(), header.getShipDateValue()) );
        hardsurfacesEdiOrder.setPoDate( new PoDate(header.getPoDateQualifier(), header.getPoDateValue()) );

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
            shipInfo.setSpecialInst1( custInfo.getSpecialInst1() );
            shipInfo.setSpecialInst2( custInfo.getSpecialInst2() );
            shipInfo.setSpecialInst3( custInfo.getSpecialInst3() );
            shipInfo.setSpecialInst4( custInfo.getSpecialInst4() );
            shipInfo.setTerritory( custInfo.getTerritory() );
            shipInfo.setDistrict( custInfo.getDistrict() );
            shipInfo.setRegion( custInfo.getRegion() );
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

    protected ConsumerAddress legacyConsumerAddressToConsumerAddress(LegacyConsumerAddress legacyConsumerAddress) {
        if ( legacyConsumerAddress == null ) {
            return null;
        }

        ConsumerAddress consumerAddress = new ConsumerAddress();

        consumerAddress.setName( legacyConsumerAddress.getName() );
        consumerAddress.setAddressLine1( legacyConsumerAddress.getAddressLine1() );
        consumerAddress.setAddressLine2( legacyConsumerAddress.getAddressLine2() );
        consumerAddress.setCity( legacyConsumerAddress.getCity() );
        consumerAddress.setState( legacyConsumerAddress.getState() );
        consumerAddress.setZip( legacyConsumerAddress.getZip() );

        return consumerAddress;
    }

    protected ThirdPartyAddress legacyThirdPartyAddressToThirdPartyAddress(LegacyThirdPartyAddress legacyThirdPartyAddress) {
        if ( legacyThirdPartyAddress == null ) {
            return null;
        }

        ThirdPartyAddress thirdPartyAddress = new ThirdPartyAddress();

        thirdPartyAddress.setName( legacyThirdPartyAddress.getName() );
        thirdPartyAddress.setAddressLine1( legacyThirdPartyAddress.getAddressLine1() );
        thirdPartyAddress.setAddressLine2( legacyThirdPartyAddress.getAddressLine2() );
        thirdPartyAddress.setCity( legacyThirdPartyAddress.getCity() );
        thirdPartyAddress.setState( legacyThirdPartyAddress.getState() );
        thirdPartyAddress.setZip( legacyThirdPartyAddress.getZip() );
        thirdPartyAddress.setAccountNbr( legacyThirdPartyAddress.getAccountNbr() );
        thirdPartyAddress.setBillFlag( legacyThirdPartyAddress.getBillFlag() );

        return thirdPartyAddress;
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
