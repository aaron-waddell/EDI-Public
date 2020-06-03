package com.shaw.ediorderservices.hibernate;

import javax.validation.constraints.NotNull;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@EnableConfigurationProperties
@ConfigurationProperties(prefix="config")
public class ServiceConfig {
    
    @NotNull private String databaseRegion;
    @NotNull private String appGuid;
    @NotNull private String secretToken;
    @NotNull private String userKey;
    @NotNull private String dsservicesServername;
    @NotNull private String cswsServername;
    @NotNull private String[] allowedUrls;
    @NotNull private String[] emailAddresses;
    @NotNull private String showSql;
    @NotNull private String formatSql;
    @NotNull private String db2Dialect;
    @NotNull private String sqlDialect;
    @NotNull private String h2Dialect;
    @NotNull private String db2Schema;
    @NotNull private String sqlSchema;
    @NotNull private String db2DdlAuto;
    @NotNull private String sqlDdlAuto;

    public String getDatabaseRegion() {
		return databaseRegion;
	}
	public void setDatabaseRegion(String databaseRegion) {
		this.databaseRegion = databaseRegion;
	}
	public String getAppGuid() {
		return appGuid;
	}
	public void setAppGuid(String appGuid) {
		this.appGuid = appGuid;
	}
	public String getSecretToken() {
		return secretToken;
	}
	public void setSecretToken(String secretToken) {
		this.secretToken = secretToken;
	}
	public String getUserKey() {
		return userKey;
	}
	public void setUserKey(String userKey) {
		this.userKey = userKey;
	}
	public String getDsservicesServername() {
		return dsservicesServername;
	}
	public void setDsservicesServername(String dsservicesServername) {
		this.dsservicesServername = dsservicesServername;
	}
	public String getCswsServername() {
		return cswsServername;
	}
	public void setCswsServername(String cswsServername) {
		this.cswsServername = cswsServername;
	}
	public String[] getAllowedUrls() {
		return allowedUrls;
	}
	public void setAllowedUrls(String[] allowedUrls) {
		this.allowedUrls = allowedUrls;
	}
	public String[] getEmailAddresses() {
		return emailAddresses;
	}
	public void setEmailAddresses(String[] emailAddresses) {
		this.emailAddresses = emailAddresses;
	}
	public String getShowSql() {
		// TODO Auto-generated method stub
		return showSql;
	}
	public void setShowSql(String showSql) {
		this.showSql = showSql;
	}
	public String getFormatSql() {
		return formatSql;
	}
	public void setFormatSql(String formatSql) {
		this.formatSql = formatSql;
	}
	public String getDb2Schema() {
		return db2Schema;
	}
	public void setDb2Schema(String db2Schema) {
		this.db2Schema = db2Schema;
	}
	public String getSqlSchema() {
		return sqlSchema;
	}
	public void setSqlSchema(String sqlSchema) {
		this.sqlSchema = sqlSchema;
	}
	public String getDb2Dialect() {
		return db2Dialect;
	}
	public void setDb2Dialect(String db2Dialect) {
		this.db2Dialect = db2Dialect;
	}
	public String getSqlDialect() {
		return sqlDialect;
	}
	public void setSqlDialect(String sqlDialect) {
		this.sqlDialect = sqlDialect;
	}
	public String getH2Dialect() {
		return h2Dialect;
	}
	public void setH2Dialect(String h2Dialect) {
		this.h2Dialect = h2Dialect;
	}
	public String getDb2DdlAuto() {
		return db2DdlAuto;
	}
	public void setDb2DdlAuto(String db2DdlAuto) {
		this.db2DdlAuto = db2DdlAuto;
	}
	public String getSqlDdlAuto() {
		return sqlDdlAuto;
	}
	public void setSqlDdlAuto(String sqlDdlAuto) {
		this.sqlDdlAuto = sqlDdlAuto;
	}
}