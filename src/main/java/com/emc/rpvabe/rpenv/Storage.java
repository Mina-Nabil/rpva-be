package com.emc.rpvabe.rpenv;

public class Storage {
  public String name;
  public String serialNumber;
  public String type;         //vCenter server in case of RP4VMs
  public String model;
  public String primaryIp;    // SPA IP address in physical storage
  public String secondaryIp;  // SPB IP address in physical storage
  public String version;
  public String username;
  public String connectivityStatus;
  public String connectivityStatusDetails;
  public String port;
  public Boolean ioThrottling;
  public String throttlingLevel;
  public int throttlingValue; //If custom throttling is enabled
}
