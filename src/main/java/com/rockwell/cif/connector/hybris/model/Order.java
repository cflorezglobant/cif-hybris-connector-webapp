/*
 * Commerce Webservices v2
 * These services manage all of the common commerce functionality, and also include customizations from installed AddOns.
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.rockwell.cif.connector.hybris.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Representation of an Order
 */
@ApiModel(description = "Representation of an Order")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-23T22:16:40.723Z")



public class Order {
  @SerializedName("appliedOrderPromotions")
  private List<PromotionResult> appliedOrderPromotions = null;

  @SerializedName("appliedProductPromotions")
  private List<PromotionResult> appliedProductPromotions = null;

  @SerializedName("appliedVouchers")
  private List<Voucher> appliedVouchers = null;

  @SerializedName("calculated")
  private Boolean calculated = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("consignments")
  private List<Consignment> consignments = null;

  @SerializedName("created")
  private OffsetDateTime created = null;

  @SerializedName("deliveryAddress")
  private Address deliveryAddress = null;

  @SerializedName("deliveryCost")
  private Price deliveryCost = null;

  @SerializedName("deliveryItemsQuantity")
  private Long deliveryItemsQuantity = null;

  @SerializedName("deliveryMode")
  private DeliveryMode deliveryMode = null;

  @SerializedName("deliveryOrderGroups")
  private List<DeliveryOrderEntryGroup> deliveryOrderGroups = null;

  @SerializedName("deliveryStatus")
  private String deliveryStatus = null;

  @SerializedName("deliveryStatusDisplay")
  private String deliveryStatusDisplay = null;

  @SerializedName("entries")
  private List<OrderEntry> entries = null;

  @SerializedName("guestCustomer")
  private Boolean guestCustomer = null;

  @SerializedName("guid")
  private String guid = null;

  @SerializedName("net")
  private Boolean net = null;

  @SerializedName("orderDiscounts")
  private Price orderDiscounts = null;

  @SerializedName("paymentInfo")
  private PaymentDetails paymentInfo = null;

  @SerializedName("pickupItemsQuantity")
  private Long pickupItemsQuantity = null;

  @SerializedName("pickupOrderGroups")
  private List<PickupOrderEntryGroup> pickupOrderGroups = null;

  @SerializedName("productDiscounts")
  private Price productDiscounts = null;

  @SerializedName("site")
  private String site = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("statusDisplay")
  private String statusDisplay = null;

  @SerializedName("store")
  private String store = null;

  @SerializedName("subTotal")
  private Price subTotal = null;

  @SerializedName("totalDiscounts")
  private Price totalDiscounts = null;

  @SerializedName("totalItems")
  private Integer totalItems = null;

  @SerializedName("totalPrice")
  private Price totalPrice = null;

  @SerializedName("totalPriceWithTax")
  private Price totalPriceWithTax = null;

  @SerializedName("totalTax")
  private Price totalTax = null;

  @SerializedName("totalUnitCount")
  private Integer totalUnitCount = null;

  @SerializedName("unconsignedEntries")
  private List<OrderEntry> unconsignedEntries = null;

  @SerializedName("user")
  private Principal user = null;

  public Order appliedOrderPromotions(List<PromotionResult> appliedOrderPromotions) {
    this.appliedOrderPromotions = appliedOrderPromotions;
    return this;
  }

  public Order addAppliedOrderPromotionsItem(PromotionResult appliedOrderPromotionsItem) {
    if (this.appliedOrderPromotions == null) {
      this.appliedOrderPromotions = new ArrayList<PromotionResult>();
    }
    this.appliedOrderPromotions.add(appliedOrderPromotionsItem);
    return this;
  }

   /**
   * List of applied order promotions
   * @return appliedOrderPromotions
  **/
  @ApiModelProperty(value = "List of applied order promotions")
  public List<PromotionResult> getAppliedOrderPromotions() {
    return appliedOrderPromotions;
  }

  public void setAppliedOrderPromotions(List<PromotionResult> appliedOrderPromotions) {
    this.appliedOrderPromotions = appliedOrderPromotions;
  }

  public Order appliedProductPromotions(List<PromotionResult> appliedProductPromotions) {
    this.appliedProductPromotions = appliedProductPromotions;
    return this;
  }

  public Order addAppliedProductPromotionsItem(PromotionResult appliedProductPromotionsItem) {
    if (this.appliedProductPromotions == null) {
      this.appliedProductPromotions = new ArrayList<PromotionResult>();
    }
    this.appliedProductPromotions.add(appliedProductPromotionsItem);
    return this;
  }

   /**
   * List of applied product promotions
   * @return appliedProductPromotions
  **/
  @ApiModelProperty(value = "List of applied product promotions")
  public List<PromotionResult> getAppliedProductPromotions() {
    return appliedProductPromotions;
  }

  public void setAppliedProductPromotions(List<PromotionResult> appliedProductPromotions) {
    this.appliedProductPromotions = appliedProductPromotions;
  }

  public Order appliedVouchers(List<Voucher> appliedVouchers) {
    this.appliedVouchers = appliedVouchers;
    return this;
  }

  public Order addAppliedVouchersItem(Voucher appliedVouchersItem) {
    if (this.appliedVouchers == null) {
      this.appliedVouchers = new ArrayList<Voucher>();
    }
    this.appliedVouchers.add(appliedVouchersItem);
    return this;
  }

   /**
   * List of applied vouchers
   * @return appliedVouchers
  **/
  @ApiModelProperty(value = "List of applied vouchers")
  public List<Voucher> getAppliedVouchers() {
    return appliedVouchers;
  }

  public void setAppliedVouchers(List<Voucher> appliedVouchers) {
    this.appliedVouchers = appliedVouchers;
  }

  public Order calculated(Boolean calculated) {
    this.calculated = calculated;
    return this;
  }

   /**
   * Flag showing if order is calculated
   * @return calculated
  **/
  @ApiModelProperty(value = "Flag showing if order is calculated")
  public Boolean isCalculated() {
    return calculated;
  }

  public void setCalculated(Boolean calculated) {
    this.calculated = calculated;
  }

  public Order code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Code number of order
   * @return code
  **/
  @ApiModelProperty(value = "Code number of order")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Order consignments(List<Consignment> consignments) {
    this.consignments = consignments;
    return this;
  }

  public Order addConsignmentsItem(Consignment consignmentsItem) {
    if (this.consignments == null) {
      this.consignments = new ArrayList<Consignment>();
    }
    this.consignments.add(consignmentsItem);
    return this;
  }

   /**
   * List of consignment
   * @return consignments
  **/
  @ApiModelProperty(value = "List of consignment")
  public List<Consignment> getConsignments() {
    return consignments;
  }

  public void setConsignments(List<Consignment> consignments) {
    this.consignments = consignments;
  }

  public Order created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Date of order creation
   * @return created
  **/
  @ApiModelProperty(value = "Date of order creation")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public Order deliveryAddress(Address deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
    return this;
  }

   /**
   * Delivery address
   * @return deliveryAddress
  **/
  @ApiModelProperty(value = "Delivery address")
  public Address getDeliveryAddress() {
    return deliveryAddress;
  }

  public void setDeliveryAddress(Address deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
  }

  public Order deliveryCost(Price deliveryCost) {
    this.deliveryCost = deliveryCost;
    return this;
  }

   /**
   * Delivery cost
   * @return deliveryCost
  **/
  @ApiModelProperty(value = "Delivery cost")
  public Price getDeliveryCost() {
    return deliveryCost;
  }

  public void setDeliveryCost(Price deliveryCost) {
    this.deliveryCost = deliveryCost;
  }

  public Order deliveryItemsQuantity(Long deliveryItemsQuantity) {
    this.deliveryItemsQuantity = deliveryItemsQuantity;
    return this;
  }

   /**
   * Quantity of delivery items
   * @return deliveryItemsQuantity
  **/
  @ApiModelProperty(value = "Quantity of delivery items")
  public Long getDeliveryItemsQuantity() {
    return deliveryItemsQuantity;
  }

  public void setDeliveryItemsQuantity(Long deliveryItemsQuantity) {
    this.deliveryItemsQuantity = deliveryItemsQuantity;
  }

  public Order deliveryMode(DeliveryMode deliveryMode) {
    this.deliveryMode = deliveryMode;
    return this;
  }

   /**
   * Delivery mode information
   * @return deliveryMode
  **/
  @ApiModelProperty(value = "Delivery mode information")
  public DeliveryMode getDeliveryMode() {
    return deliveryMode;
  }

  public void setDeliveryMode(DeliveryMode deliveryMode) {
    this.deliveryMode = deliveryMode;
  }

  public Order deliveryOrderGroups(List<DeliveryOrderEntryGroup> deliveryOrderGroups) {
    this.deliveryOrderGroups = deliveryOrderGroups;
    return this;
  }

  public Order addDeliveryOrderGroupsItem(DeliveryOrderEntryGroup deliveryOrderGroupsItem) {
    if (this.deliveryOrderGroups == null) {
      this.deliveryOrderGroups = new ArrayList<DeliveryOrderEntryGroup>();
    }
    this.deliveryOrderGroups.add(deliveryOrderGroupsItem);
    return this;
  }

   /**
   * List of delivery order entries group
   * @return deliveryOrderGroups
  **/
  @ApiModelProperty(value = "List of delivery order entries group")
  public List<DeliveryOrderEntryGroup> getDeliveryOrderGroups() {
    return deliveryOrderGroups;
  }

  public void setDeliveryOrderGroups(List<DeliveryOrderEntryGroup> deliveryOrderGroups) {
    this.deliveryOrderGroups = deliveryOrderGroups;
  }

  public Order deliveryStatus(String deliveryStatus) {
    this.deliveryStatus = deliveryStatus;
    return this;
  }

   /**
   * Order delivery status
   * @return deliveryStatus
  **/
  @ApiModelProperty(value = "Order delivery status")
  public String getDeliveryStatus() {
    return deliveryStatus;
  }

  public void setDeliveryStatus(String deliveryStatus) {
    this.deliveryStatus = deliveryStatus;
  }

  public Order deliveryStatusDisplay(String deliveryStatusDisplay) {
    this.deliveryStatusDisplay = deliveryStatusDisplay;
    return this;
  }

   /**
   * Order delivery status display
   * @return deliveryStatusDisplay
  **/
  @ApiModelProperty(value = "Order delivery status display")
  public String getDeliveryStatusDisplay() {
    return deliveryStatusDisplay;
  }

  public void setDeliveryStatusDisplay(String deliveryStatusDisplay) {
    this.deliveryStatusDisplay = deliveryStatusDisplay;
  }

  public Order entries(List<OrderEntry> entries) {
    this.entries = entries;
    return this;
  }

  public Order addEntriesItem(OrderEntry entriesItem) {
    if (this.entries == null) {
      this.entries = new ArrayList<OrderEntry>();
    }
    this.entries.add(entriesItem);
    return this;
  }

   /**
   * List of order entries
   * @return entries
  **/
  @ApiModelProperty(value = "List of order entries")
  public List<OrderEntry> getEntries() {
    return entries;
  }

  public void setEntries(List<OrderEntry> entries) {
    this.entries = entries;
  }

  public Order guestCustomer(Boolean guestCustomer) {
    this.guestCustomer = guestCustomer;
    return this;
  }

   /**
   * Flag showing if customer is Guest customer
   * @return guestCustomer
  **/
  @ApiModelProperty(value = "Flag showing if customer is Guest customer")
  public Boolean isGuestCustomer() {
    return guestCustomer;
  }

  public void setGuestCustomer(Boolean guestCustomer) {
    this.guestCustomer = guestCustomer;
  }

  public Order guid(String guid) {
    this.guid = guid;
    return this;
  }

   /**
   * Guest user id identifier
   * @return guid
  **/
  @ApiModelProperty(value = "Guest user id identifier")
  public String getGuid() {
    return guid;
  }

  public void setGuid(String guid) {
    this.guid = guid;
  }

  public Order net(Boolean net) {
    this.net = net;
    return this;
  }

   /**
   * Flag stating iv value is net-value
   * @return net
  **/
  @ApiModelProperty(value = "Flag stating iv value is net-value")
  public Boolean isNet() {
    return net;
  }

  public void setNet(Boolean net) {
    this.net = net;
  }

  public Order orderDiscounts(Price orderDiscounts) {
    this.orderDiscounts = orderDiscounts;
    return this;
  }

   /**
   * Order discounts
   * @return orderDiscounts
  **/
  @ApiModelProperty(value = "Order discounts")
  public Price getOrderDiscounts() {
    return orderDiscounts;
  }

  public void setOrderDiscounts(Price orderDiscounts) {
    this.orderDiscounts = orderDiscounts;
  }

  public Order paymentInfo(PaymentDetails paymentInfo) {
    this.paymentInfo = paymentInfo;
    return this;
  }

   /**
   * Payment information
   * @return paymentInfo
  **/
  @ApiModelProperty(value = "Payment information")
  public PaymentDetails getPaymentInfo() {
    return paymentInfo;
  }

  public void setPaymentInfo(PaymentDetails paymentInfo) {
    this.paymentInfo = paymentInfo;
  }

  public Order pickupItemsQuantity(Long pickupItemsQuantity) {
    this.pickupItemsQuantity = pickupItemsQuantity;
    return this;
  }

   /**
   * Quantity of pickup items
   * @return pickupItemsQuantity
  **/
  @ApiModelProperty(value = "Quantity of pickup items")
  public Long getPickupItemsQuantity() {
    return pickupItemsQuantity;
  }

  public void setPickupItemsQuantity(Long pickupItemsQuantity) {
    this.pickupItemsQuantity = pickupItemsQuantity;
  }

  public Order pickupOrderGroups(List<PickupOrderEntryGroup> pickupOrderGroups) {
    this.pickupOrderGroups = pickupOrderGroups;
    return this;
  }

  public Order addPickupOrderGroupsItem(PickupOrderEntryGroup pickupOrderGroupsItem) {
    if (this.pickupOrderGroups == null) {
      this.pickupOrderGroups = new ArrayList<PickupOrderEntryGroup>();
    }
    this.pickupOrderGroups.add(pickupOrderGroupsItem);
    return this;
  }

   /**
   * List of pickup order entry group
   * @return pickupOrderGroups
  **/
  @ApiModelProperty(value = "List of pickup order entry group")
  public List<PickupOrderEntryGroup> getPickupOrderGroups() {
    return pickupOrderGroups;
  }

  public void setPickupOrderGroups(List<PickupOrderEntryGroup> pickupOrderGroups) {
    this.pickupOrderGroups = pickupOrderGroups;
  }

  public Order productDiscounts(Price productDiscounts) {
    this.productDiscounts = productDiscounts;
    return this;
  }

   /**
   * Product discounts
   * @return productDiscounts
  **/
  @ApiModelProperty(value = "Product discounts")
  public Price getProductDiscounts() {
    return productDiscounts;
  }

  public void setProductDiscounts(Price productDiscounts) {
    this.productDiscounts = productDiscounts;
  }

  public Order site(String site) {
    this.site = site;
    return this;
  }

   /**
   * Site
   * @return site
  **/
  @ApiModelProperty(value = "Site")
  public String getSite() {
    return site;
  }

  public void setSite(String site) {
    this.site = site;
  }

  public Order status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status of order
   * @return status
  **/
  @ApiModelProperty(value = "Status of order")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Order statusDisplay(String statusDisplay) {
    this.statusDisplay = statusDisplay;
    return this;
  }

   /**
   * Status display
   * @return statusDisplay
  **/
  @ApiModelProperty(value = "Status display")
  public String getStatusDisplay() {
    return statusDisplay;
  }

  public void setStatusDisplay(String statusDisplay) {
    this.statusDisplay = statusDisplay;
  }

  public Order store(String store) {
    this.store = store;
    return this;
  }

   /**
   * Store
   * @return store
  **/
  @ApiModelProperty(value = "Store")
  public String getStore() {
    return store;
  }

  public void setStore(String store) {
    this.store = store;
  }

  public Order subTotal(Price subTotal) {
    this.subTotal = subTotal;
    return this;
  }

   /**
   * Subtotal price
   * @return subTotal
  **/
  @ApiModelProperty(value = "Subtotal price")
  public Price getSubTotal() {
    return subTotal;
  }

  public void setSubTotal(Price subTotal) {
    this.subTotal = subTotal;
  }

  public Order totalDiscounts(Price totalDiscounts) {
    this.totalDiscounts = totalDiscounts;
    return this;
  }

   /**
   * Total discounts
   * @return totalDiscounts
  **/
  @ApiModelProperty(value = "Total discounts")
  public Price getTotalDiscounts() {
    return totalDiscounts;
  }

  public void setTotalDiscounts(Price totalDiscounts) {
    this.totalDiscounts = totalDiscounts;
  }

  public Order totalItems(Integer totalItems) {
    this.totalItems = totalItems;
    return this;
  }

   /**
   * Get totalItems
   * @return totalItems
  **/
  @ApiModelProperty(value = "")
  public Integer getTotalItems() {
    return totalItems;
  }

  public void setTotalItems(Integer totalItems) {
    this.totalItems = totalItems;
  }

  public Order totalPrice(Price totalPrice) {
    this.totalPrice = totalPrice;
    return this;
  }

   /**
   * Total price value
   * @return totalPrice
  **/
  @ApiModelProperty(value = "Total price value")
  public Price getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(Price totalPrice) {
    this.totalPrice = totalPrice;
  }

  public Order totalPriceWithTax(Price totalPriceWithTax) {
    this.totalPriceWithTax = totalPriceWithTax;
    return this;
  }

   /**
   * Total price with tax
   * @return totalPriceWithTax
  **/
  @ApiModelProperty(value = "Total price with tax")
  public Price getTotalPriceWithTax() {
    return totalPriceWithTax;
  }

  public void setTotalPriceWithTax(Price totalPriceWithTax) {
    this.totalPriceWithTax = totalPriceWithTax;
  }

  public Order totalTax(Price totalTax) {
    this.totalTax = totalTax;
    return this;
  }

   /**
   * Total tax price
   * @return totalTax
  **/
  @ApiModelProperty(value = "Total tax price")
  public Price getTotalTax() {
    return totalTax;
  }

  public void setTotalTax(Price totalTax) {
    this.totalTax = totalTax;
  }

  public Order totalUnitCount(Integer totalUnitCount) {
    this.totalUnitCount = totalUnitCount;
    return this;
  }

   /**
   * Get totalUnitCount
   * @return totalUnitCount
  **/
  @ApiModelProperty(value = "")
  public Integer getTotalUnitCount() {
    return totalUnitCount;
  }

  public void setTotalUnitCount(Integer totalUnitCount) {
    this.totalUnitCount = totalUnitCount;
  }

  public Order unconsignedEntries(List<OrderEntry> unconsignedEntries) {
    this.unconsignedEntries = unconsignedEntries;
    return this;
  }

  public Order addUnconsignedEntriesItem(OrderEntry unconsignedEntriesItem) {
    if (this.unconsignedEntries == null) {
      this.unconsignedEntries = new ArrayList<OrderEntry>();
    }
    this.unconsignedEntries.add(unconsignedEntriesItem);
    return this;
  }

   /**
   * List of unconsigned order entries
   * @return unconsignedEntries
  **/
  @ApiModelProperty(value = "List of unconsigned order entries")
  public List<OrderEntry> getUnconsignedEntries() {
    return unconsignedEntries;
  }

  public void setUnconsignedEntries(List<OrderEntry> unconsignedEntries) {
    this.unconsignedEntries = unconsignedEntries;
  }

  public Order user(Principal user) {
    this.user = user;
    return this;
  }

   /**
   * User information
   * @return user
  **/
  @ApiModelProperty(value = "User information")
  public Principal getUser() {
    return user;
  }

  public void setUser(Principal user) {
    this.user = user;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Order order = (Order) o;
    return Objects.equals(this.appliedOrderPromotions, order.appliedOrderPromotions) &&
        Objects.equals(this.appliedProductPromotions, order.appliedProductPromotions) &&
        Objects.equals(this.appliedVouchers, order.appliedVouchers) &&
        Objects.equals(this.calculated, order.calculated) &&
        Objects.equals(this.code, order.code) &&
        Objects.equals(this.consignments, order.consignments) &&
        Objects.equals(this.created, order.created) &&
        Objects.equals(this.deliveryAddress, order.deliveryAddress) &&
        Objects.equals(this.deliveryCost, order.deliveryCost) &&
        Objects.equals(this.deliveryItemsQuantity, order.deliveryItemsQuantity) &&
        Objects.equals(this.deliveryMode, order.deliveryMode) &&
        Objects.equals(this.deliveryOrderGroups, order.deliveryOrderGroups) &&
        Objects.equals(this.deliveryStatus, order.deliveryStatus) &&
        Objects.equals(this.deliveryStatusDisplay, order.deliveryStatusDisplay) &&
        Objects.equals(this.entries, order.entries) &&
        Objects.equals(this.guestCustomer, order.guestCustomer) &&
        Objects.equals(this.guid, order.guid) &&
        Objects.equals(this.net, order.net) &&
        Objects.equals(this.orderDiscounts, order.orderDiscounts) &&
        Objects.equals(this.paymentInfo, order.paymentInfo) &&
        Objects.equals(this.pickupItemsQuantity, order.pickupItemsQuantity) &&
        Objects.equals(this.pickupOrderGroups, order.pickupOrderGroups) &&
        Objects.equals(this.productDiscounts, order.productDiscounts) &&
        Objects.equals(this.site, order.site) &&
        Objects.equals(this.status, order.status) &&
        Objects.equals(this.statusDisplay, order.statusDisplay) &&
        Objects.equals(this.store, order.store) &&
        Objects.equals(this.subTotal, order.subTotal) &&
        Objects.equals(this.totalDiscounts, order.totalDiscounts) &&
        Objects.equals(this.totalItems, order.totalItems) &&
        Objects.equals(this.totalPrice, order.totalPrice) &&
        Objects.equals(this.totalPriceWithTax, order.totalPriceWithTax) &&
        Objects.equals(this.totalTax, order.totalTax) &&
        Objects.equals(this.totalUnitCount, order.totalUnitCount) &&
        Objects.equals(this.unconsignedEntries, order.unconsignedEntries) &&
        Objects.equals(this.user, order.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appliedOrderPromotions, appliedProductPromotions, appliedVouchers, calculated, code, consignments, created, deliveryAddress, deliveryCost, deliveryItemsQuantity, deliveryMode, deliveryOrderGroups, deliveryStatus, deliveryStatusDisplay, entries, guestCustomer, guid, net, orderDiscounts, paymentInfo, pickupItemsQuantity, pickupOrderGroups, productDiscounts, site, status, statusDisplay, store, subTotal, totalDiscounts, totalItems, totalPrice, totalPriceWithTax, totalTax, totalUnitCount, unconsignedEntries, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    
    sb.append("    appliedOrderPromotions: ").append(toIndentedString(appliedOrderPromotions)).append("\n");
    sb.append("    appliedProductPromotions: ").append(toIndentedString(appliedProductPromotions)).append("\n");
    sb.append("    appliedVouchers: ").append(toIndentedString(appliedVouchers)).append("\n");
    sb.append("    calculated: ").append(toIndentedString(calculated)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    consignments: ").append(toIndentedString(consignments)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    deliveryAddress: ").append(toIndentedString(deliveryAddress)).append("\n");
    sb.append("    deliveryCost: ").append(toIndentedString(deliveryCost)).append("\n");
    sb.append("    deliveryItemsQuantity: ").append(toIndentedString(deliveryItemsQuantity)).append("\n");
    sb.append("    deliveryMode: ").append(toIndentedString(deliveryMode)).append("\n");
    sb.append("    deliveryOrderGroups: ").append(toIndentedString(deliveryOrderGroups)).append("\n");
    sb.append("    deliveryStatus: ").append(toIndentedString(deliveryStatus)).append("\n");
    sb.append("    deliveryStatusDisplay: ").append(toIndentedString(deliveryStatusDisplay)).append("\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
    sb.append("    guestCustomer: ").append(toIndentedString(guestCustomer)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    net: ").append(toIndentedString(net)).append("\n");
    sb.append("    orderDiscounts: ").append(toIndentedString(orderDiscounts)).append("\n");
    sb.append("    paymentInfo: ").append(toIndentedString(paymentInfo)).append("\n");
    sb.append("    pickupItemsQuantity: ").append(toIndentedString(pickupItemsQuantity)).append("\n");
    sb.append("    pickupOrderGroups: ").append(toIndentedString(pickupOrderGroups)).append("\n");
    sb.append("    productDiscounts: ").append(toIndentedString(productDiscounts)).append("\n");
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusDisplay: ").append(toIndentedString(statusDisplay)).append("\n");
    sb.append("    store: ").append(toIndentedString(store)).append("\n");
    sb.append("    subTotal: ").append(toIndentedString(subTotal)).append("\n");
    sb.append("    totalDiscounts: ").append(toIndentedString(totalDiscounts)).append("\n");
    sb.append("    totalItems: ").append(toIndentedString(totalItems)).append("\n");
    sb.append("    totalPrice: ").append(toIndentedString(totalPrice)).append("\n");
    sb.append("    totalPriceWithTax: ").append(toIndentedString(totalPriceWithTax)).append("\n");
    sb.append("    totalTax: ").append(toIndentedString(totalTax)).append("\n");
    sb.append("    totalUnitCount: ").append(toIndentedString(totalUnitCount)).append("\n");
    sb.append("    unconsignedEntries: ").append(toIndentedString(unconsignedEntries)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
