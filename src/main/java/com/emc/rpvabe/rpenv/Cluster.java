package com.emc.rpvabe.rpenv;

import java.util.*;

public class Cluster {
  public Boolean isMaintenanceMode;
  public String clusterName;
  public String internalClusterName;
  public String SSID;
  public String version;
  public String managementIP;
  public Repository repoVolume;
  public String communicationMode;
  public ArrayList<RPA> rpas;
  public ArrayList<Splitter> splitters;
  public ArrayList<Storage> storages;
  public ArrayList<vCenter> vCenters;
}
