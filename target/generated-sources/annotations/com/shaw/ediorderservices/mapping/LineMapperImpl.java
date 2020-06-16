package com.shaw.ediorderservices.mapping;

import com.shaw.ediorderservices.csws.CartLine;
import com.shaw.ediorderservices.csws.SamplesLine;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderLine;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderLine.EdiOrderLinePK;
import com.shaw.ediorderservices.persistance.db2.entity.SamplesInfo;
import com.shaw.ediorderservices.persistance.sqlserver.entity.line.CarpetEdiLine;
import com.shaw.ediorderservices.persistance.sqlserver.entity.line.EdiLine;
import com.shaw.ediorderservices.persistance.sqlserver.entity.line.HardsurfacesEdiLine;
import com.shaw.ediorderservices.persistance.sqlserver.entity.line.SamplesEdiLine;
import java.time.format.DateTimeFormatter;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
<<<<<<< HEAD
    date = "2020-06-09T08:49:54-0400",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 3.20.0.v20191203-2131, environment: Java 1.8.0_241 (Oracle Corporation)"
=======
    date = "2020-06-09T09:05:27-0400",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 3.21.0.v20200304-1404, environment: Java 14.0.1 (Oracle Corporation)"
>>>>>>> 319fd74e6b77d79ce2f29be4907fd93101894f9c
)
@Component
public class LineMapperImpl implements LineMapper {

    @Override
    public EdiOrderLine ediLineToLegacy(EdiLine ediLine) {
        if ( ediLine == null ) {
            return null;
        }

        EdiOrderLine ediOrderLine = new EdiOrderLine();

        ediOrderLine.setId( ediLineToEdiOrderLinePK( ediLine ) );
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

        samplesEdiLine.setStyle( line.getStyle() );
        samplesEdiLine.setColor( line.getColor() );
        samplesEdiLine.setCustReqShipDate( line.getCustReqShipDate() );

        samplesEdiLine.setId( 0L );

        return samplesEdiLine;
    }

    @Override
    public CarpetEdiLine legacyLineToCarpetEdiLine(EdiOrderLine line) {
        if ( line == null ) {
            return null;
        }

        CarpetEdiLine carpetEdiLine = new CarpetEdiLine();

        carpetEdiLine.setStyle( line.getStyle() );
        carpetEdiLine.setColor( line.getColor() );
        carpetEdiLine.setCustReqShipDate( line.getCustReqShipDate() );

        carpetEdiLine.setId( 0L );

        return carpetEdiLine;
    }

    @Override
    public HardsurfacesEdiLine legacyLineToHardsurfacesEdiLine(EdiOrderLine line) {
        if ( line == null ) {
            return null;
        }

        HardsurfacesEdiLine hardsurfacesEdiLine = new HardsurfacesEdiLine();

        hardsurfacesEdiLine.setStyle( line.getStyle() );
        hardsurfacesEdiLine.setColor( line.getColor() );
        hardsurfacesEdiLine.setCustReqShipDate( line.getCustReqShipDate() );

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
        samplesLine.setSubset( samplesInfo.getSubset() );
        samplesLine.setDelVehName( samplesInfo.getDelVehName() );
        samplesLine.setCartonQty( samplesInfo.getCartonQty() );
        samplesLine.setDelVehNbr( samplesInfo.getDelVehNbr() );
        samplesLine.setPackType( samplesInfo.getPackType() );
        samplesLine.setPartNbr( samplesInfo.getPartNbr() );
        samplesLine.setSamplesColorNbr( samplesInfo.getSamplesColorNbr() );
        samplesLine.setSamplesStyleNbr( samplesInfo.getSamplesStyleNbr() );
        samplesLine.setInvPartNbr( samplesInfo.getInvPartNbr() );

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

    protected EdiOrderLinePK ediLineToEdiOrderLinePK(EdiLine ediLine) {
        if ( ediLine == null ) {
            return null;
        }

        EdiOrderLinePK ediOrderLinePK = new EdiOrderLinePK();

        ediOrderLinePK.setPoLineNo( String.valueOf( ediLine.getLineNbr() ) );

        return ediOrderLinePK;
    }
}
