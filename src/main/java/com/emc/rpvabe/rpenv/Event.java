package com.emc.rpvabe.rpenv;

import java.util.Date;
import java.util.ArrayList;

public class Event {
  public Date eventDate;
  public String topic;
  public String scope;
  public String level;
  public String eventID;
  public Cluster cluster;
  public String globalLink;
  public String summary;
  public String moreInfo;
  public String userAction;
  public ArrayList<RPA> eventRPAs;
  public String details;

}
