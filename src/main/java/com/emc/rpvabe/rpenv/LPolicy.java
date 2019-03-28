package com.emc.rpvabe.rpenv;

import java.util.*;

public class LPolicy {
  public Boolean isActive;
  public String mode;
  public String isregulateApplication;
  public String priority;   //Minimize (Lag)
  public String RPO;
  public String snapshotGranularity;
  public String compression;
  public Boolean isDeduplication;
  public String bandwidthLimit;
  public String snapbasedReplication;
  public Boolean isDynamicbyLatency;  //if Synchronous
  public String minLatency;
  public String maxLatency;
  public Boolean isDynamicbyThroughput;
  public String minThroughput;
  public String maxThroughput;

}
