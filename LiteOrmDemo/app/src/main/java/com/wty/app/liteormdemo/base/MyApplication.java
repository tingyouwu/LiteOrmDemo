package com.wty.app.liteormdemo.base;

import android.app.Application;

import com.litesuits.orm.LiteOrm;
import com.litesuits.orm.db.DataBaseConfig;

public class MyApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		DataBaseConfig config = new DataBaseConfig(getApplicationContext(),"liteorm.db");
		config.debugged = true;
		config.dbVersion = 1;
		config.onUpdateListener = null;

		LiteOrm liteOrm = LiteOrm.newSingleInstance(config);

	}

}
