package com.emc.rpvabe.rpenv;

import java.util.*;

public class CG {
  public String name;
  public boolean isEnabled;
  public RPA primaryRPA;
  public boolean isDistributed;
  public boolean isExternalManagement;
  public ArrayList<Copy> copies;
  public ArrayList<Link> links;
  public ArrayList<Rset> rsets;
  public ArrayList<RPA>  secondaryRPAs;


  public CG (String name, boolean isEnabled, RPA primaryRPA, boolean isDistributed, boolean isExternalManagement){
    this.name = name;
    this.isEnabled = isEnabled;
    this.primaryRPA = primaryRPA;
    this.isDistributed = isDistributed;
    this.isExternalManagement = isExternalManagement;

    this.copies         = new ArrayList<Copy>();
    this.links          = new ArrayList<Link>();
    this.rsets          = new ArrayList<Rset>();
    this.secondaryRPAs  = new ArrayList<RPA>();
  }

  public void addCopy(Copy copy){
    this.copies.add(copy);
  }

  public void addLink(Link link){
    this.links.add(link);
  }

  public void addRset(Rset rset){
    this.rsets.add(rset);
  }

  public void addsecondaryRPA(RPA rpa){
    this.secondaryRPAs.add(rpa);
  }

}
