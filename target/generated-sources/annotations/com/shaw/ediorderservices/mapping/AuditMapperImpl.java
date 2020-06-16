package com.shaw.ediorderservices.mapping;

import com.shaw.ediorderservices.persistance.db2.entity.EdiAudit;
import com.shaw.ediorderservices.persistance.sqlserver.entity.date.PoDate;
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.EdiOrder;
import java.time.LocalDate;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
<<<<<<< HEAD
    date = "2020-06-09T08:49:53-0400",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 3.20.0.v20191203-2131, environment: Java 1.8.0_241 (Oracle Corporation)"
=======
    date = "2020-06-09T09:05:26-0400",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 3.21.0.v20200304-1404, environment: Java 14.0.1 (Oracle Corporation)"
>>>>>>> 319fd74e6b77d79ce2f29be4907fd93101894f9c
)
@Component
public class AuditMapperImpl implements AuditMapper {

    @Override
    public EdiAudit ediOrderToEdiAudit(EdiOrder ediOrder) {
        if ( ediOrder == null ) {
            return null;
        }

        EdiAudit ediAudit = new EdiAudit();

        ediAudit.setOrderNumber( ediOrder.getShawOrderNbr() );
        if ( ediOrder.getLegacyOrderNumber() != null ) {
            ediAudit.setEdiOrderNumber( ediOrder.getLegacyOrderNumber() );
        }
        ediAudit.setPoDate( ediOrderPoDateDateValue( ediOrder ) );
        ediAudit.setOrderingSys( ediOrder.getOrderingSystem() );
        ediAudit.setBillToStore( ediOrder.getBillToStore() );
        ediAudit.setCustomerCode( ediOrder.getCustomerCode() );
        ediAudit.setPoNumber( ediOrder.getPoNumber() );

        ediAudit.setPoLineNo( "0" );
        ediAudit.setChngLid( "CARR" );
        ediAudit.setChngFunction( "CARR" );
        ediAudit.setLineNumber( 0L );
        ediAudit.setOrderDate( java.time.LocalDateTime.now() );

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
