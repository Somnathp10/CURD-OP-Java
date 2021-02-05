//package com.config;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//import java.util.Map;
//import java.util.concurrent.ConcurrentHashMap;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.ApplicationRunner;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.dao.DataAccessException;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.ResultSetExtractor;
//import org.springframework.jdbc.core.RowMapper;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//
////import com.straviso.clec.utils.ClecConstants;
//
//
//@Component
//@ComponentScan
//@Configuration
//public class CLECConfiguration implements ApplicationRunner{
//
//	@Autowired
//	JdbcTemplate jdbcTemplate;
//	@Value("${spring.ns.eMailWorkerThreadPool}")
//	int emailTheadPool;
//
//	@Value("${spring.ns.userid}")
//	String userid;
//
//	@Value("${spring.ns.password}")
//	String password;
//
//	public int getEmailTheadPool() {
//		return emailTheadPool;
//	}
//
//	public String getUserid() {
//		return userid;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	private static Logger logger = LoggerFactory.getLogger(CLECConfiguration.class);
//	public static ConcurrentHashMap<String,String> CLECConfig=new ConcurrentHashMap<>();
//
//	@Override
//	@SuppressWarnings("rawtypes")
//	public void run(ApplicationArguments args) throws Exception {
//		logger.info("In Run method of CLECConfiguration ");
//		CLECConfig.put("http","https");
//	}
//}
