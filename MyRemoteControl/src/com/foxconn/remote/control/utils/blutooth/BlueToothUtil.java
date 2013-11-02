package com.foxconn.remote.control.utils.blutooth;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;

/**
 *  藍牙搜索工具
 *  
 * @author KrisLight
 *
 */
public class BlueToothUtil {
	private BluetoothAdapter mBtAdapter;
	private Context mContext;

	public BlueToothUtil(Context context, BluetoothAdapter adapter) {
		this.mBtAdapter = adapter;
		this.mContext = context;
	}

	// 搜索
	public void doDiscovery() {
		if (mBtAdapter.isDiscovering()) {
			mBtAdapter.cancelDiscovery();
		}
		// Request discover from BluetoothAdapter
		mBtAdapter.startDiscovery();
	}
}
