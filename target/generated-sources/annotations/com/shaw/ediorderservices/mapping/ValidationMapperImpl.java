package com.shaw.ediorderservices.mapping;

import com.shaw.ediorderservices.persistance.db2.entity.EdiOrdValidation;
import com.shaw.ediorderservices.persistance.db2.entity.EdiReasonCode;
import com.shaw.ediorderservices.persistance.sqlserver.entity.EdiValidation;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-06-19T17:53:21-0400",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 3.21.0.v20200304-1404, environment: Java 14.0.1 (Oracle Corporation)"
)
@Component
public class ValidationMapperImpl implements ValidationMapper {

    @Override
    public EdiOrdValidation validationToLegacy(EdiValidation v) {
        if ( v == null ) {
            return null;
        }

        EdiOrdValidation ediOrdValidation = new EdiOrdValidation();

        ediOrdValidation.setActionCode( v.getActionCode() );
        ediOrdValidation.setAssignedTo( v.getAssignedTo() );
        ediOrdValidation.setStatus( v.getStatus() );

        ediOrdValidation.setId( null );

        return ediOrdValidation;
    }

    @Override
    public EdiValidation legacyToValidation(EdiOrdValidation v) {
        if ( v == null ) {
            return null;
        }

        EdiValidation ediValidation = new EdiValidation();

        ediValidation.setDescription( vEdiReasonCodeDescription( v ) );
        ediValidation.setActionCode( v.getActionCode() );
        ediValidation.setAssignedTo( v.getAssignedTo() );
        ediValidation.setStatus( v.getStatus() );

        ediValidation.setId( 0L );

        return ediValidation;
    }

    private String vEdiReasonCodeDescription(EdiOrdValidation ediOrdValidation) {
        if ( ediOrdValidation == null ) {
            return null;
        }
        EdiReasonCode ediReasonCode = ediOrdValidation.getEdiReasonCode();
        if ( ediReasonCode == null ) {
            return null;
        }
        String description = ediReasonCode.getDescription();
        if ( description == null ) {
            return null;
        }
        return description;
    }
}
