package com.shaw.ediorderservices.mapping;

import com.shaw.ediorderservices.persistance.db2.entity.LegacyConsumerAddress;
import com.shaw.ediorderservices.persistance.db2.entity.LegacyShipToAddress;
import com.shaw.ediorderservices.persistance.db2.entity.LegacyThirdPartyAddress;
import com.shaw.ediorderservices.persistance.sqlserver.entity.ConsumerAddress;
import com.shaw.ediorderservices.persistance.sqlserver.entity.ShipToAddress;
import com.shaw.ediorderservices.persistance.sqlserver.entity.ThirdPartyAddress;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-06-02T09:30:22-0400",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 3.21.0.v20200304-1404, environment: Java 14.0.1 (Oracle Corporation)"
)
@Component
public class AddressMapperImpl implements AddressMapper {

    @Override
    public LegacyConsumerAddress consumerAddressToLegacyConsumerAddress(ConsumerAddress addr) {
        if ( addr == null ) {
            return null;
        }

        LegacyConsumerAddress legacyConsumerAddress = new LegacyConsumerAddress();

        legacyConsumerAddress.setConsumerShipFlg( addr.getShipFlag() );
        legacyConsumerAddress.setConsumerPoDateValue( addr.getPoDate() );
        legacyConsumerAddress.setAddressLine1( addr.getAddressLine1() );
        legacyConsumerAddress.setAddressLine2( addr.getAddressLine2() );
        legacyConsumerAddress.setName( addr.getName() );
        legacyConsumerAddress.setState( addr.getState() );

        legacyConsumerAddress.setZip( (addr.getZip() + "         ").substring(0,9) );
        legacyConsumerAddress.setCity( (addr.getCity() + "                   ").substring(0,19) );

        return legacyConsumerAddress;
    }

    @Override
    public LegacyShipToAddress shipToAddressToLegacyShipToAddress(ShipToAddress addr) {
        if ( addr == null ) {
            return null;
        }

        LegacyShipToAddress legacyShipToAddress = new LegacyShipToAddress();

        legacyShipToAddress.setAddressLine1( addr.getAddressLine1() );
        legacyShipToAddress.setAddressLine2( addr.getAddressLine2() );
        legacyShipToAddress.setCountry( addr.getCountry() );
        legacyShipToAddress.setCustNbr( addr.getCustNbr() );
        legacyShipToAddress.setName( addr.getName() );
        legacyShipToAddress.setPhone( addr.getPhone() );
        legacyShipToAddress.setProvince( addr.getProvince() );
        legacyShipToAddress.setState( addr.getState() );
        legacyShipToAddress.setTruncFlag( addr.getTruncFlag() );

        legacyShipToAddress.setZip( (addr.getZip() + "           ").substring(0,11) );
        legacyShipToAddress.setCity( (addr.getCity() + "                   ").substring(0,19) );

        return legacyShipToAddress;
    }

    @Override
    public LegacyThirdPartyAddress thirdPartyAddressToLegacyThirdPartyAddress(ThirdPartyAddress addr) {
        if ( addr == null ) {
            return null;
        }

        LegacyThirdPartyAddress legacyThirdPartyAddress = new LegacyThirdPartyAddress();

        legacyThirdPartyAddress.setAccountNbr( addr.getAccountNbr() );
        legacyThirdPartyAddress.setAddressLine1( addr.getAddressLine1() );
        legacyThirdPartyAddress.setAddressLine2( addr.getAddressLine2() );
        legacyThirdPartyAddress.setBillFlag( addr.getBillFlag() );
        legacyThirdPartyAddress.setCity( addr.getCity() );
        legacyThirdPartyAddress.setName( addr.getName() );
        legacyThirdPartyAddress.setState( addr.getState() );

        legacyThirdPartyAddress.setZip( (addr.getZip() + "         ").substring(0,9) );

        return legacyThirdPartyAddress;
    }

    @Override
    public ShipToAddress legacyShipToAddressToShipToAddress(LegacyShipToAddress addr) {
        if ( addr == null ) {
            return null;
        }

        ShipToAddress shipToAddress = new ShipToAddress();

        shipToAddress.setName( addr.getName() );
        shipToAddress.setAddressLine1( addr.getAddressLine1() );
        shipToAddress.setAddressLine2( addr.getAddressLine2() );
        shipToAddress.setCity( addr.getCity() );
        shipToAddress.setState( addr.getState() );
        shipToAddress.setProvince( addr.getProvince() );
        shipToAddress.setZip( addr.getZip() );
        shipToAddress.setPhone( addr.getPhone() );
        shipToAddress.setCustNbr( addr.getCustNbr() );
        shipToAddress.setTruncFlag( addr.getTruncFlag() );

        shipToAddress.setCountry( addr.getCountry().equals("CANADA")?"CN":addr.getCountry().substring(0,2) );

        return shipToAddress;
    }
}
