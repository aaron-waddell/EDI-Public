package com.shaw.ediorderservices.mapping;

import com.shaw.ediorderservices.csws.CartLine;
import com.shaw.ediorderservices.csws.SamplesLine;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderDate;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderHeader;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderLine;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderLine.EdiOrderLinePK;
import com.shaw.ediorderservices.persistance.db2.entity.LegacyConsumerAddress;
import com.shaw.ediorderservices.persistance.db2.entity.LegacyShipToAddress;
import com.shaw.ediorderservices.persistance.db2.entity.LegacyThirdPartyAddress;
import com.shaw.ediorderservices.persistance.db2.entity.SamplesInfo;
import com.shaw.ediorderservices.persistance.sqlserver.entity.CarpetEdiLine;
import com.shaw.ediorderservices.persistance.sqlserver.entity.ConsumerAddress;
import com.shaw.ediorderservices.persistance.sqlserver.entity.EdiLine;
import com.shaw.ediorderservices.persistance.sqlserver.entity.EdiOrder;
import com.shaw.ediorderservices.persistance.sqlserver.entity.GenericDate;
import com.shaw.ediorderservices.persistance.sqlserver.entity.HardsurfacesEdiLine;
import com.shaw.ediorderservices.persistance.sqlserver.entity.SamplesEdiLine;
import com.shaw.ediorderservices.persistance.sqlserver.entity.ShipToAddress;
import com.shaw.ediorderservices.persistance.sqlserver.entity.ThirdPartyAddress;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-06-03T14:05:25-0400",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 3.21.0.v20200304-1404, environment: Java 14.0.1 (Oracle Corporation)"
)
@Component
public class LineMapperImpl implements LineMapper {

    @Override
    public EdiOrderLine ediLineToLegacy(EdiLine ediLine) {
        if ( ediLine == null ) {
            return null;
        }

        EdiOrderLine ediOrderLine = new EdiOrderLine();

        ediOrderLine.setPk( ediLineToEdiOrderLinePK( ediLine ) );
        ediOrderLine.setCustReqShipDate( ediLine.getCustReqShipDate() );
        ediOrderLine.setColor( ediLine.getColor() );
        ediOrderLine.setStyle( ediLine.getStyle() );

        ediOrderLine.setRoundedFlag( "N" );

        return ediOrderLine;
    }

    @Override
    public SamplesEdiLine legacyLineToSamplesEdiLine(EdiOrderLine line) {
        if ( line == null ) {
            return null;
        }

        SamplesEdiLine samplesEdiLine = new SamplesEdiLine();

        samplesEdiLine.setColor( line.getColor() );
        samplesEdiLine.setCustReqShipDate( line.getCustReqShipDate() );
        samplesEdiLine.setStyle( line.getStyle() );

        samplesEdiLine.setId( 0L );

        return samplesEdiLine;
    }

    @Override
    public CarpetEdiLine legacyLineToCarpetEdiLine(EdiOrderLine line) {
        if ( line == null ) {
            return null;
        }

        CarpetEdiLine carpetEdiLine = new CarpetEdiLine();

        carpetEdiLine.setColor( line.getColor() );
        carpetEdiLine.setCustReqShipDate( line.getCustReqShipDate() );
        carpetEdiLine.setStyle( line.getStyle() );

        carpetEdiLine.setId( 0L );

        return carpetEdiLine;
    }

    @Override
    public HardsurfacesEdiLine legacyLineToHardsurfacesEdiLine(EdiOrderLine line) {
        if ( line == null ) {
            return null;
        }

        HardsurfacesEdiLine hardsurfacesEdiLine = new HardsurfacesEdiLine();

        hardsurfacesEdiLine.setColor( line.getColor() );
        hardsurfacesEdiLine.setCustReqShipDate( line.getCustReqShipDate() );
        hardsurfacesEdiLine.setStyle( line.getStyle() );

        hardsurfacesEdiLine.setId( 0L );

        return hardsurfacesEdiLine;
    }

    @Override
    public CartLine ediLineToCartLine(EdiLine ediLine) {
        if ( ediLine == null ) {
            return null;
        }

        CartLine cartLine = new CartLine();

        cartLine.setLineNbr( String.valueOf( ediLine.getLineNbr() ) );
        if ( ediLine.getShipDate() != null ) {
            cartLine.setShipDate( DateTimeFormatter.ISO_LOCAL_DATE.format( ediLine.getShipDate() ) );
        }

        return cartLine;
    }

    @Override
    public SamplesLine samplesInfoToSamplesLine(SamplesInfo samplesInfo) {
        if ( samplesInfo == null ) {
            return null;
        }

        SamplesLine samplesLine = new SamplesLine();

        samplesLine.setStyleNbr( samplesInfo.getSamplesStyleNbr() );
        samplesLine.setSamplesPrivateStyle( samplesInfo.getSamplesStyleNbr() );
        samplesLine.setTypesetDesc( samplesInfo.getDelVehName() );
        samplesLine.setColorNbr( samplesInfo.getSamplesColorNbr() );
        samplesLine.setCartonQty( samplesInfo.getCartonQty() );
        samplesLine.setDelVehName( samplesInfo.getDelVehName() );
        samplesLine.setDelVehNbr( samplesInfo.getDelVehNbr() );
        samplesLine.setInvPartNbr( samplesInfo.getInvPartNbr() );
        samplesLine.setPackType( samplesInfo.getPackType() );
        samplesLine.setPartNbr( samplesInfo.getPartNbr() );
        samplesLine.setSamplesColorNbr( samplesInfo.getSamplesColorNbr() );
        samplesLine.setSamplesStyleNbr( samplesInfo.getSamplesStyleNbr() );
        samplesLine.setSubset( samplesInfo.getSubset() );

        samplesLine.setSidemarkType1( "S" );
        samplesLine.setSidemarkType2( "S" );
        samplesLine.setGenericLabelFlag( true );
        samplesLine.setUom( "EA" );
        samplesLine.setUnitsPerSubset( 1 );
        samplesLine.setGrade( "A" );
        samplesLine.setLocation( "01" );
        samplesLine.setWeightUom( "LBS" );
        samplesLine.setSamplesSeqNbr( "" );

        return samplesLine;
    }

    protected LegacyConsumerAddress consumerAddressToLegacyConsumerAddress(ConsumerAddress consumerAddress) {
        if ( consumerAddress == null ) {
            return null;
        }

        LegacyConsumerAddress legacyConsumerAddress = new LegacyConsumerAddress();

        legacyConsumerAddress.setAddressLine1( consumerAddress.getAddressLine1() );
        legacyConsumerAddress.setAddressLine2( consumerAddress.getAddressLine2() );
        legacyConsumerAddress.setCity( consumerAddress.getCity() );
        legacyConsumerAddress.setName( consumerAddress.getName() );
        legacyConsumerAddress.setState( consumerAddress.getState() );
        legacyConsumerAddress.setZip( consumerAddress.getZip() );

        return legacyConsumerAddress;
    }

    protected LegacyShipToAddress shipToAddressToLegacyShipToAddress(ShipToAddress shipToAddress) {
        if ( shipToAddress == null ) {
            return null;
        }

        LegacyShipToAddress legacyShipToAddress = new LegacyShipToAddress();

        legacyShipToAddress.setAddressLine1( shipToAddress.getAddressLine1() );
        legacyShipToAddress.setAddressLine2( shipToAddress.getAddressLine2() );
        legacyShipToAddress.setCity( shipToAddress.getCity() );
        legacyShipToAddress.setCountry( shipToAddress.getCountry() );
        legacyShipToAddress.setCustNbr( shipToAddress.getCustNbr() );
        legacyShipToAddress.setName( shipToAddress.getName() );
        legacyShipToAddress.setPhone( shipToAddress.getPhone() );
        legacyShipToAddress.setProvince( shipToAddress.getProvince() );
        legacyShipToAddress.setState( shipToAddress.getState() );
        legacyShipToAddress.setTruncFlag( shipToAddress.getTruncFlag() );
        legacyShipToAddress.setZip( shipToAddress.getZip() );

        return legacyShipToAddress;
    }

    protected LegacyThirdPartyAddress thirdPartyAddressToLegacyThirdPartyAddress(ThirdPartyAddress thirdPartyAddress) {
        if ( thirdPartyAddress == null ) {
            return null;
        }

        LegacyThirdPartyAddress legacyThirdPartyAddress = new LegacyThirdPartyAddress();

        legacyThirdPartyAddress.setAccountNbr( thirdPartyAddress.getAccountNbr() );
        legacyThirdPartyAddress.setAddressLine1( thirdPartyAddress.getAddressLine1() );
        legacyThirdPartyAddress.setAddressLine2( thirdPartyAddress.getAddressLine2() );
        legacyThirdPartyAddress.setBillFlag( thirdPartyAddress.getBillFlag() );
        legacyThirdPartyAddress.setCity( thirdPartyAddress.getCity() );
        legacyThirdPartyAddress.setName( thirdPartyAddress.getName() );
        legacyThirdPartyAddress.setState( thirdPartyAddress.getState() );
        legacyThirdPartyAddress.setZip( thirdPartyAddress.getZip() );

        return legacyThirdPartyAddress;
    }

    protected EdiOrderDate genericDateToEdiOrderDate(GenericDate genericDate) {
        if ( genericDate == null ) {
            return null;
        }

        EdiOrderDate ediOrderDate = new EdiOrderDate();

        ediOrderDate.setDateValue( genericDate.getDateValue() );

        return ediOrderDate;
    }

    protected List<EdiOrderDate> genericDateListToEdiOrderDateList(List<GenericDate> list) {
        if ( list == null ) {
            return null;
        }

        List<EdiOrderDate> list1 = new ArrayList<EdiOrderDate>( list.size() );
        for ( GenericDate genericDate : list ) {
            list1.add( genericDateToEdiOrderDate( genericDate ) );
        }

        return list1;
    }

    protected List<EdiOrderLine> ediLineListToEdiOrderLineList(List<EdiLine> list) {
        if ( list == null ) {
            return null;
        }

        List<EdiOrderLine> list1 = new ArrayList<EdiOrderLine>( list.size() );
        for ( EdiLine ediLine : list ) {
            list1.add( ediLineToLegacy( ediLine ) );
        }

        return list1;
    }

    protected EdiOrderHeader ediOrderToEdiOrderHeader(EdiOrder ediOrder) {
        if ( ediOrder == null ) {
            return null;
        }

        EdiOrderHeader ediOrderHeader = new EdiOrderHeader();

        ediOrderHeader.setAgreementNumber( ediOrder.getAgreementNumber() );
        ediOrderHeader.setBeg( ediOrder.getBeg() );
        ediOrderHeader.setBillToStore( ediOrder.getBillToStore() );
        ediOrderHeader.setCarrierCode( ediOrder.getCarrierCode() );
        ediOrderHeader.setCommCust( ediOrder.getCommCust() );
        ediOrderHeader.setConsumerAddress( consumerAddressToLegacyConsumerAddress( ediOrder.getConsumerAddress() ) );
        ediOrderHeader.setCustDept( ediOrder.getCustDept() );
        ediOrderHeader.setCustomerCode( ediOrder.getCustomerCode() );
        ediOrderHeader.setDunsNbr( ediOrder.getDunsNbr() );
        ediOrderHeader.setNbDate( ediOrder.getNbDate() );
        ediOrderHeader.setOrderType( ediOrder.getOrderType() );
        ediOrderHeader.setOrderingSystem( ediOrder.getOrderingSystem() );
        ediOrderHeader.setPoNumber( ediOrder.getPoNumber() );
        ediOrderHeader.setShipByDate( ediOrder.getShipByDate() );
        ediOrderHeader.setShipCancelDate( ediOrder.getShipCancelDate() );
        ediOrderHeader.setShipToAddress( shipToAddressToLegacyShipToAddress( ediOrder.getShipToAddress() ) );
        ediOrderHeader.setStoreName( ediOrder.getStoreName() );
        ediOrderHeader.setThirdPartyAddress( thirdPartyAddressToLegacyThirdPartyAddress( ediOrder.getThirdPartyAddress() ) );
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

        return ediOrderHeader;
    }

    protected EdiOrderLinePK ediLineToEdiOrderLinePK(EdiLine ediLine) {
        if ( ediLine == null ) {
            return null;
        }

        EdiOrderLinePK ediOrderLinePK = new EdiOrderLinePK();

        ediOrderLinePK.setPoLineNo( String.valueOf( ediLine.getLineNbr() ) );
        ediOrderLinePK.setEdiOrderHeader( ediOrderToEdiOrderHeader( ediLine.getEdiOrder() ) );

        return ediOrderLinePK;
    }
}
