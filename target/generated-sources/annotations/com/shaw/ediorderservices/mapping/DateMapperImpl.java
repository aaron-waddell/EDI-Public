package com.shaw.ediorderservices.mapping;

import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderDate;
import com.shaw.ediorderservices.persistance.sqlserver.entity.date.GenericDate;
import com.shaw.ediorderservices.persistance.sqlserver.entity.date.IEdiDate;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-06-09T08:49:53-0400",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 3.20.0.v20191203-2131, environment: Java 1.8.0_241 (Oracle Corporation)"
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
