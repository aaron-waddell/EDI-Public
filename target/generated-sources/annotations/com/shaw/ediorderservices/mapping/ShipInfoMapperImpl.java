package com.shaw.ediorderservices.mapping;

import com.shaw.ediorderservices.csws.OrderHeader;
import com.shaw.ediorderservices.csws.OrderLine;
import com.shaw.ediorderservices.persistance.db2.entity.EdiShipInfo;
import com.shaw.ediorderservices.persistance.db2.entity.EdiShipInfo.EdiShipInfoPK;
import com.shaw.ediorderservices.persistance.db2.entity.EdiShipInfoLn;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-06-05T13:58:46-0400",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 3.21.0.v20200304-1404, environment: Java 14.0.1 (Oracle Corporation)"
)
@Component
public class ShipInfoMapperImpl implements ShipInfoMapper {

    @Override
    public EdiShipInfo orderHeaderToShipInfo(OrderHeader header) {
        if ( header == null ) {
            return null;
        }

        EdiShipInfo ediShipInfo = new EdiShipInfo();

        ediShipInfo.setCommCust( header.getCommCust() );
        ediShipInfo.setCustNbr( header.getCustNbr() );
        if ( header.getDeliveryDate() != null ) {
            ediShipInfo.setDeliveryDate( LocalDate.parse( header.getDeliveryDate() ) );
        }
        ediShipInfo.setDepartment( header.getDepartment() );
        if ( header.getNbDate() != null ) {
            ediShipInfo.setNbDate( LocalDate.parse( header.getNbDate() ) );
        }
        ediShipInfo.setOrderType( header.getOrderType() );
        ediShipInfo.setOrderTypeDesc( header.getOrderTypeDesc() );
        ediShipInfo.setId( orderHeaderToEdiShipInfoPK( header ) );

        return ediShipInfo;
    }

    @Override
    public EdiShipInfoLn orderLineToShipInfoLn(OrderLine line) {
        if ( line == null ) {
            return null;
        }

        EdiShipInfoLn ediShipInfoLn = new EdiShipInfoLn();

        ediShipInfoLn.setColorNbr( line.getColorNbr() );
        ediShipInfoLn.setDyelot( line.getDyelot() );
        ediShipInfoLn.setLength( BigDecimal.valueOf( line.getLength() ) );
        ediShipInfoLn.setPoLineNbr( String.valueOf( line.getPoLineNbr() ) );
        try {
            if ( line.getRepromDate() != null ) {
                ediShipInfoLn.setRepromDate( new SimpleDateFormat().parse( line.getRepromDate() ) );
            }
        }
        catch ( ParseException e ) {
            throw new RuntimeException( e );
        }
        ediShipInfoLn.setRollNbr( line.getRollNbr() );
        ediShipInfoLn.setStyleNbr( line.getStyleNbr() );
        ediShipInfoLn.setUnitPrice( BigDecimal.valueOf( line.getUnitPrice() ) );
        ediShipInfoLn.setWidth( BigDecimal.valueOf( line.getWidth() ) );

        return ediShipInfoLn;
    }

    protected EdiShipInfoPK orderHeaderToEdiShipInfoPK(OrderHeader orderHeader) {
        if ( orderHeader == null ) {
            return null;
        }

        EdiShipInfoPK ediShipInfoPK = new EdiShipInfoPK();

        ediShipInfoPK.setDateStamp( java.time.LocalDate.now() );

        return ediShipInfoPK;
    }
}
