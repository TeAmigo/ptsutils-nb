
/**
 * PtsBracketOrder.java Created Mar 30, 2011 by rickcharon.
 *
 */


package ptsutils;

import com.ib.client.Contract;
import com.ib.client.Order;



public class PtsBracketOrder {
  private Contract contract;
  private Order parentOrder = null;
  private Order stopLossOrder = null;
  private Order profitStopOrder = null;

  public PtsBracketOrder() {
  }

  public PtsBracketOrder(Contract contract) {
    this.contract = contract;
  }

  public PtsBracketOrder(Contract contract, Order parentOrder, Order stopLossOrder, Order profitStopOrder) {
    this.contract = contract;
    this.parentOrder = parentOrder;
    this.stopLossOrder = stopLossOrder;
    this.profitStopOrder = profitStopOrder;
  }

  public Contract getContract() {
    return contract;
  }

  public void setContract(Contract contract) {
    this.contract = contract;
  }

  public Order getParentOrder() {
    return parentOrder;
  }

  public void setParentOrder(Order parentOrder) {
    this.parentOrder = parentOrder;
  }

  public Order getProfitStopOrder() {
    return profitStopOrder;
  }

  public void setProfitStopOrder(Order profitStopOrder) {
    this.profitStopOrder = profitStopOrder;
  }

  public Order getStopLossOrder() {
    return stopLossOrder;
  }

  public void setStopLossOrder(Order stopLossOrder) {
    this.stopLossOrder = stopLossOrder;
  }

  

}
