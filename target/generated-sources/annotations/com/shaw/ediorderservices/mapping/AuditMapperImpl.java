package com.shaw.ediorderservices.mapping;

import com.shaw.ediorderservices.persistance.db2.entity.EdiAudit;
import com.shaw.ediorderservices.persistance.sqlserver.entity.EdiOrder;
import com.shaw.ediorderservices.persistance.sqlserver.entity.PoDate;
import java.time.LocalDate;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-06-03T08:36:01-0400",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 3.21.0.v20200304-1404, environment: Java 14.0.1 (Oracle Corporation)"
)
@Component
public class AuditMapperImpl implements AuditMapper {

    @Override
    public EdiAudit ediOrderToEdiAudit(EdiOrder ediOrder) {
        if ( ediOrder == null ) {
            return null;
        }

        EdiAudit ediAudit = new EdiAudit();

        ediAudit.setPoDate( ediOrderPoDateDateValue( ediOrder ) );
        ediAudit.setBillToStore( ediOrder.getBillToStore() );
        ediAudit.setCustomerCode( ediOrder.getCustomerCode() );
        ediAudit.setPoNumber( ediOrder.getPoNumber() );

        ediAudit.setChngFunction( "CARR" );
        ediAudit.setChngLid( "CARR" );

        return ediAudit;
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
}
