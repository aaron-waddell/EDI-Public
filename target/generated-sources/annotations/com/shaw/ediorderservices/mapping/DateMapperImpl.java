package com.shaw.ediorderservices.mapping;

import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderDate;
import com.shaw.ediorderservices.persistance.sqlserver.entity.GenericDate;
import com.shaw.ediorderservices.persistance.sqlserver.entity.IEdiDate;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-06-03T10:39:22-0400",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 3.21.0.v20200304-1404, environment: Java 14.0.1 (Oracle Corporation)"
)
@Component
public class DateMapperImpl implements DateMapper {

    @Override
    public EdiOrderDate ediDateToLegacy(IEdiDate ediDate) {
        if ( ediDate == null ) {
            return null;
        }

        EdiOrderDate ediOrderDate = new EdiOrderDate();

        return ediOrderDate;
    }

    @Override
    public GenericDate legacyDateToEdiDate(EdiOrderDate ediOrderDate) {
        if ( ediOrderDate == null ) {
            return null;
        }

        GenericDate genericDate = new GenericDate();

        genericDate.setDateValue( ediOrderDate.getDateValue() );

        genericDate.setId( 0 );

        return genericDate;
    }
}
