package com.emc.rpvabe.rpenv;

public class Copy {
  public String name;
  public String role;
  public Cluster cluster;
  public CPolicy copyPolicy;




  public Copy(String name, String role, Cluster cluster, CPolicy copyPolicy){
    this.name = name;
    this.role = role;
    this.cluster = cluster;
    this.copyPolicy = copyPolicy;
  }
}
