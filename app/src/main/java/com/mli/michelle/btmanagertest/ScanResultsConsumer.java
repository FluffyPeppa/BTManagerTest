package com.mli.michelle.btmanagertest;

import android.bluetooth.BluetoothDevice;

/*
 * Created by Michelle Li
 * on 2021-05-10.
 */
public interface ScanResultsConsumer {

	public void candidateBleDevice(BluetoothDevice device, byte[] scan_record, int rssi); public void scanningStarted();
	public void scanningStopped();
}