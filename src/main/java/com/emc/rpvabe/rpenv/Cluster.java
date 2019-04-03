package com.emc.rpvabe.rpenv;

import java.util.*;

public class Cluster {
  public Boolean isMaintenanceMode;
  public String clusterName;
  public String internalClusterName;
  public String SSID;
  public String version;
  public String managementIP;
  public Volume repoVolume;
  public String communicationMode;
  public ArrayList<RPA> rpas;
  public ArrayList<Splitter> splitters;
  public ArrayList<Storage> storages;


  public Cluster (Boolean isMaintenanceMode, String clusterName, String internalClusterName, String SSID, String version, String managementIP, Volume repoVolume, String communicationMode){
    this.isMaintenanceMode = isMaintenanceMode;
    this.clusterName = clusterName;
    this.internalClusterName = internalClusterName;
    this.SSID = SSID;
    this.version = version;
    this.managementIP = managementIP;
    this.repoVolume = repoVolume;
    this.communicationMode = communicationMode;
  }

  public void addRPA(RPA rpa){
    this.rpas.add(rpa);
  }

  public void addSplitter(Splitter splitter){
    this.splitters.add(splitter);
  }

  public void addStorage(Storage storage){
    this.storages.add(storage);
  }



}
