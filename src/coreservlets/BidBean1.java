package coreservlets;

import javax.faces.bean.*;

@ManagedBean
public class BidBean1 {
  private String userId = "";
  private String keyword = "";
  private String bidAmount;
  private double numericBidAmount = 0;
  private String bidDuration;
  private int numericBidDuration = 0;

  public String getUserId() { return(userId); }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String doBid() {
    doSomeBusinessLogicWithBid();
    return("show-bid-1");
  }
}
