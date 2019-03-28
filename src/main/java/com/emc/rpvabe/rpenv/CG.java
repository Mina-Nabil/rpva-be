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
}
