package com.shaw.ediorderservices.mapping;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.shaw.ediorderservices.helper.MockTest;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderDate;
import com.shaw.ediorderservices.persistance.sqlserver.entity.date.EdiDate;
import com.shaw.ediorderservices.persistance.sqlserver.entity.date.GenericDate;

@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
@ExtendWith(SpringExtension.class)
class DateMapperTest extends MockTest{

	private static final GenericDate ediDate = mockBuilder.build(GenericDate.class);
	private static final EdiOrderDate ediOrderDate = mockBuilder.build(EdiOrderDate.class);

	@Autowired
	DateMapper dateMapper;
	
	@Test
	final void testEdiDateToLegacy() {
		EdiOrderDate result = dateMapper.ediDateToLegacy(ediDate);
		assertEquals(ediDate.getDateValue(),result.getDateValue());
		assertEquals(ediDate.getQualifier(),result.getPk().getQualifier());
	}

	@Test
	final void testLegacyDateToEdiDate() {
		EdiDate result = dateMapper.legacyDateToEdiDate(ediOrderDate);
		assertEquals(ediOrderDate.getDateValue(),result.getDateValue());
		assertEquals(ediOrderDate.getPk().getQualifier(),result.getQualifier());
	}

}
