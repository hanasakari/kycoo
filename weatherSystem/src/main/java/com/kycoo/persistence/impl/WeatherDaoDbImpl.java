package com.kycoo.persistence.impl;

import java.sql.Date;

import com.kycoo.domain.Weather;
import com.kycoo.persistence.WeatherDao;

public class WeatherDaoDbImpl 

extends BaseDaoHibernateAdapter<Weather, String>
implements WeatherDao
{

	@Override
	/**
	 * ����ʱ���ѯ����
	 */
	public Weather findByDate(Date date) {
		return sessionFactory.getCurrentSession().get(entityType, date);
	}

}
