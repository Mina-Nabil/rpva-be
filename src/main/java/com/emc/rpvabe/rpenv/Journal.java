package com.emc.rpvabe.rpenv;

import java.util.*;

public class Journal {
  public String usage;
  public String total;
  public String latestImage;
  public String currentImage;
  public String journalLag;
  public String currentProtectionWindow;
  public String predictedProtectionWindow;
  public String averageJournalCompressionRatio;
  public String mode;
  public ArrayList<Volume> journalVolumes;
}
