package com.ecps.seckill.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class BizProject {
    private String id;

    private String changeState;

    private String changeId;

    private String customerId;

    private String customerName;

    private String customerType;

    private String officeId;

    private String companyId;

    private String businessType;

    private String productType;

    private String busiCode;

    private String projectName;

    private Date applyTime;

    private BigDecimal financingAmount;

    private Integer timeLimit;

    private String financingPurposes;

    private String projectLeader;

    private String projectManagera;

    private String projectManagerb;

    private String isUrgent;

    private String rentType;

    private String repaymentMethod;

    private Integer payFrequency;

    private Float balancePaymentProportion;

    private Float earningsRatio;

    private Float paymentRatio;

    private BigDecimal balancePaymentAmount;

    private BigDecimal discountAmount;

    private String repaymentWay;

    private Float annualInterestRate;

    private String interestRateType;

    private String rentalItemProperties;

    private Float firstPaymentRate;

    private BigDecimal firstRent;

    private String rentaloutWay;

    private Float marginRate;

    private BigDecimal depositAmount;

    private String marginApproach;

    private String cooperationagency;

    private String assuremeantype;

    private BigDecimal marginSurplus;

    private String isApplyFlag;

    private String isReturnFlag;

    private BigDecimal nominalCost;

    private String currencyType;

    private String declarationAuthorization;

    private BigDecimal guidePrice;

    private BigDecimal clientTakePrice;

    private BigDecimal companyTakePrice;

    private String projectState;

    private String createBy;

    private Date createDate;

    private String updateBy;

    private Date updateDate;

    private String remarks;

    private String delFlag;

    private String ext1;

    private String ext2;

    private String ext3;

    private Integer ext4;

    private Integer ext5;

    private String isDraft;

    private String loanFinancingAmount;

    private Float loanTimeLimit;

    private Float loanAnnualInterestRate;

    private String loanRepaymentMethod;

    private Integer loanPayFrequency;

    private String loanProductType;

    private String operateUserId;

    private Date operateTime;

    private String isCalculationInterestIncludeLastday;

    private String isFixedRepaymentDay;

    private Date fixedRepaymentDate;

    private String notFullmonthRepaymentDay;

    private String penaltyCharge;

    private Integer penaltyChargeGraceDays;

    private Float penaltyRate;

    private Integer lateGraceDays;

    private String paymentPlanInterestCalculationMethod;

    private String paymentPlanInterestHandleMethod;

    private String penaltyPenaltyHandMethod;

    private String recoverLessSterilisationRule;

    private String recoverMoreSterilisationRule;

    private String projectEndState;

    private String currentAuditLink;

    private String lastAuditOpinion;

    private String responsibleInvestigationState;

    private String riskInvestigationState;

    private String pendingWillAllocateState;

    private String payAuditState;

    private String fileDataState;

    private String auditState;

    private Integer businessVariety;

    private Date dateOfApplication;

    private Date repaymentDate;

    private Integer calTail;

    private Integer baseInterestType;

    private Float interestRate;

    private Float interestRateFloating;

    private Float managementRate;

    private Integer calInterestCycle;

    private Float overdueInterestRateFloat;

    private String interestRateDescription;

    private Integer loanInvestment;

    private Integer loanApplication;

    private Integer interestCharge;

    private Integer interestChargeReturn;

    private String mainCoordinator;

    private String assistantCoordinator;

    private String supplementaryExplanation;

    private BigDecimal creditAmount;

    private String creditLimit;

    private String currentHanderInterest;

    private String isRemote;

    private String projectManagerc;

    private String riskOfficer;

    private String capitalAmount;

    private BigDecimal inDepositAmount;

    private BigDecimal outDepositAmount;

    private BigDecimal realDepositAmount;

    private BigDecimal backDepositAmount;

    private String selectIds;

    private String selectNames;

    private BigDecimal applyAmount;

    private Date auditTgDate;

    private Date creditStart;

    private Date creditEnd;

    private String timeLimitType;

    private String projectType;

    private String changeStr;

    private String productSchemeId;

    private String commLoanerStr;

    private String productSchemeCode;

    private String productCode;

    private String productName;

    private String borrowerName;

    private String productSchemeName;

    private String channelSide;

    private String channelRelevance;

    private String borrowCustomerSource;

    private String borrowerCard;

    private String phone;

    private String repaymentSource;

    private String carStyle;

    private String channelName;

    private String channelBankAccount;

    private BigDecimal nakedCarPrice;

    private BigDecimal downRepaymentPrice;

    private String brokerageServerMethod;

    private BigDecimal brokerageServerRate;

    private String repayInterestMethod;

    private String channelServerMethod;

    private BigDecimal channelServerRate;

    private String pneumaticServerMethod;

    private BigDecimal pneumaticServerRate;

    private BigDecimal marginRatio;

    private String marginMethod;

    private BigDecimal investorsYield;

    private BigDecimal investorsYieldName;

    private BigDecimal borrowerCost;

    private BigDecimal borrowerCostName;

    private String prepayment;

    private String prepaymentExplain;

    private String gracePeriod;

    private String debtConstraint;

    private String projectManager;

    private String projectAssistant;

    private String productManager;

    private String loanId;

    private String loanTitle;

    private String qlrUserId;

    private String contractUrl;

    private String qlrApplyStatus;

    private String channelSideId;

    private String channelRelevanceId;

    private String loanUseRemark;

    private String guaranteeMeasureRemark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getChangeState() {
        return changeState;
    }

    public void setChangeState(String changeState) {
        this.changeState = changeState == null ? null : changeState.trim();
    }

    public String getChangeId() {
        return changeId;
    }

    public void setChangeId(String changeId) {
        this.changeId = changeId == null ? null : changeId.trim();
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType == null ? null : customerType.trim();
    }

    public String getOfficeId() {
        return officeId;
    }

    public void setOfficeId(String officeId) {
        this.officeId = officeId == null ? null : officeId.trim();
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType == null ? null : businessType.trim();
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType == null ? null : productType.trim();
    }

    public String getBusiCode() {
        return busiCode;
    }

    public void setBusiCode(String busiCode) {
        this.busiCode = busiCode == null ? null : busiCode.trim();
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public BigDecimal getFinancingAmount() {
        return financingAmount;
    }

    public void setFinancingAmount(BigDecimal financingAmount) {
        this.financingAmount = financingAmount;
    }

    public Integer getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(Integer timeLimit) {
        this.timeLimit = timeLimit;
    }

    public String getFinancingPurposes() {
        return financingPurposes;
    }

    public void setFinancingPurposes(String financingPurposes) {
        this.financingPurposes = financingPurposes == null ? null : financingPurposes.trim();
    }

    public String getProjectLeader() {
        return projectLeader;
    }

    public void setProjectLeader(String projectLeader) {
        this.projectLeader = projectLeader == null ? null : projectLeader.trim();
    }

    public String getProjectManagera() {
        return projectManagera;
    }

    public void setProjectManagera(String projectManagera) {
        this.projectManagera = projectManagera == null ? null : projectManagera.trim();
    }

    public String getProjectManagerb() {
        return projectManagerb;
    }

    public void setProjectManagerb(String projectManagerb) {
        this.projectManagerb = projectManagerb == null ? null : projectManagerb.trim();
    }

    public String getIsUrgent() {
        return isUrgent;
    }

    public void setIsUrgent(String isUrgent) {
        this.isUrgent = isUrgent == null ? null : isUrgent.trim();
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType == null ? null : rentType.trim();
    }

    public String getRepaymentMethod() {
        return repaymentMethod;
    }

    public void setRepaymentMethod(String repaymentMethod) {
        this.repaymentMethod = repaymentMethod == null ? null : repaymentMethod.trim();
    }

    public Integer getPayFrequency() {
        return payFrequency;
    }

    public void setPayFrequency(Integer payFrequency) {
        this.payFrequency = payFrequency;
    }

    public Float getBalancePaymentProportion() {
        return balancePaymentProportion;
    }

    public void setBalancePaymentProportion(Float balancePaymentProportion) {
        this.balancePaymentProportion = balancePaymentProportion;
    }

    public Float getEarningsRatio() {
        return earningsRatio;
    }

    public void setEarningsRatio(Float earningsRatio) {
        this.earningsRatio = earningsRatio;
    }

    public Float getPaymentRatio() {
        return paymentRatio;
    }

    public void setPaymentRatio(Float paymentRatio) {
        this.paymentRatio = paymentRatio;
    }

    public BigDecimal getBalancePaymentAmount() {
        return balancePaymentAmount;
    }

    public void setBalancePaymentAmount(BigDecimal balancePaymentAmount) {
        this.balancePaymentAmount = balancePaymentAmount;
    }

    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    public String getRepaymentWay() {
        return repaymentWay;
    }

    public void setRepaymentWay(String repaymentWay) {
        this.repaymentWay = repaymentWay == null ? null : repaymentWay.trim();
    }

    public Float getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(Float annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public String getInterestRateType() {
        return interestRateType;
    }

    public void setInterestRateType(String interestRateType) {
        this.interestRateType = interestRateType == null ? null : interestRateType.trim();
    }

    public String getRentalItemProperties() {
        return rentalItemProperties;
    }

    public void setRentalItemProperties(String rentalItemProperties) {
        this.rentalItemProperties = rentalItemProperties == null ? null : rentalItemProperties.trim();
    }

    public Float getFirstPaymentRate() {
        return firstPaymentRate;
    }

    public void setFirstPaymentRate(Float firstPaymentRate) {
        this.firstPaymentRate = firstPaymentRate;
    }

    public BigDecimal getFirstRent() {
        return firstRent;
    }

    public void setFirstRent(BigDecimal firstRent) {
        this.firstRent = firstRent;
    }

    public String getRentaloutWay() {
        return rentaloutWay;
    }

    public void setRentaloutWay(String rentaloutWay) {
        this.rentaloutWay = rentaloutWay == null ? null : rentaloutWay.trim();
    }

    public Float getMarginRate() {
        return marginRate;
    }

    public void setMarginRate(Float marginRate) {
        this.marginRate = marginRate;
    }

    public BigDecimal getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(BigDecimal depositAmount) {
        this.depositAmount = depositAmount;
    }

    public String getMarginApproach() {
        return marginApproach;
    }

    public void setMarginApproach(String marginApproach) {
        this.marginApproach = marginApproach == null ? null : marginApproach.trim();
    }

    public String getCooperationagency() {
        return cooperationagency;
    }

    public void setCooperationagency(String cooperationagency) {
        this.cooperationagency = cooperationagency == null ? null : cooperationagency.trim();
    }

    public String getAssuremeantype() {
        return assuremeantype;
    }

    public void setAssuremeantype(String assuremeantype) {
        this.assuremeantype = assuremeantype == null ? null : assuremeantype.trim();
    }

    public BigDecimal getMarginSurplus() {
        return marginSurplus;
    }

    public void setMarginSurplus(BigDecimal marginSurplus) {
        this.marginSurplus = marginSurplus;
    }

    public String getIsApplyFlag() {
        return isApplyFlag;
    }

    public void setIsApplyFlag(String isApplyFlag) {
        this.isApplyFlag = isApplyFlag == null ? null : isApplyFlag.trim();
    }

    public String getIsReturnFlag() {
        return isReturnFlag;
    }

    public void setIsReturnFlag(String isReturnFlag) {
        this.isReturnFlag = isReturnFlag == null ? null : isReturnFlag.trim();
    }

    public BigDecimal getNominalCost() {
        return nominalCost;
    }

    public void setNominalCost(BigDecimal nominalCost) {
        this.nominalCost = nominalCost;
    }

    public String getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType == null ? null : currencyType.trim();
    }

    public String getDeclarationAuthorization() {
        return declarationAuthorization;
    }

    public void setDeclarationAuthorization(String declarationAuthorization) {
        this.declarationAuthorization = declarationAuthorization == null ? null : declarationAuthorization.trim();
    }

    public BigDecimal getGuidePrice() {
        return guidePrice;
    }

    public void setGuidePrice(BigDecimal guidePrice) {
        this.guidePrice = guidePrice;
    }

    public BigDecimal getClientTakePrice() {
        return clientTakePrice;
    }

    public void setClientTakePrice(BigDecimal clientTakePrice) {
        this.clientTakePrice = clientTakePrice;
    }

    public BigDecimal getCompanyTakePrice() {
        return companyTakePrice;
    }

    public void setCompanyTakePrice(BigDecimal companyTakePrice) {
        this.companyTakePrice = companyTakePrice;
    }

    public String getProjectState() {
        return projectState;
    }

    public void setProjectState(String projectState) {
        this.projectState = projectState == null ? null : projectState.trim();
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }

    public String getExt1() {
        return ext1;
    }

    public void setExt1(String ext1) {
        this.ext1 = ext1 == null ? null : ext1.trim();
    }

    public String getExt2() {
        return ext2;
    }

    public void setExt2(String ext2) {
        this.ext2 = ext2 == null ? null : ext2.trim();
    }

    public String getExt3() {
        return ext3;
    }

    public void setExt3(String ext3) {
        this.ext3 = ext3 == null ? null : ext3.trim();
    }

    public Integer getExt4() {
        return ext4;
    }

    public void setExt4(Integer ext4) {
        this.ext4 = ext4;
    }

    public Integer getExt5() {
        return ext5;
    }

    public void setExt5(Integer ext5) {
        this.ext5 = ext5;
    }

    public String getIsDraft() {
        return isDraft;
    }

    public void setIsDraft(String isDraft) {
        this.isDraft = isDraft == null ? null : isDraft.trim();
    }

    public String getLoanFinancingAmount() {
        return loanFinancingAmount;
    }

    public void setLoanFinancingAmount(String loanFinancingAmount) {
        this.loanFinancingAmount = loanFinancingAmount == null ? null : loanFinancingAmount.trim();
    }

    public Float getLoanTimeLimit() {
        return loanTimeLimit;
    }

    public void setLoanTimeLimit(Float loanTimeLimit) {
        this.loanTimeLimit = loanTimeLimit;
    }

    public Float getLoanAnnualInterestRate() {
        return loanAnnualInterestRate;
    }

    public void setLoanAnnualInterestRate(Float loanAnnualInterestRate) {
        this.loanAnnualInterestRate = loanAnnualInterestRate;
    }

    public String getLoanRepaymentMethod() {
        return loanRepaymentMethod;
    }

    public void setLoanRepaymentMethod(String loanRepaymentMethod) {
        this.loanRepaymentMethod = loanRepaymentMethod == null ? null : loanRepaymentMethod.trim();
    }

    public Integer getLoanPayFrequency() {
        return loanPayFrequency;
    }

    public void setLoanPayFrequency(Integer loanPayFrequency) {
        this.loanPayFrequency = loanPayFrequency;
    }

    public String getLoanProductType() {
        return loanProductType;
    }

    public void setLoanProductType(String loanProductType) {
        this.loanProductType = loanProductType == null ? null : loanProductType.trim();
    }

    public String getOperateUserId() {
        return operateUserId;
    }

    public void setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId == null ? null : operateUserId.trim();
    }

    public Date getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    public String getIsCalculationInterestIncludeLastday() {
        return isCalculationInterestIncludeLastday;
    }

    public void setIsCalculationInterestIncludeLastday(String isCalculationInterestIncludeLastday) {
        this.isCalculationInterestIncludeLastday = isCalculationInterestIncludeLastday == null ? null : isCalculationInterestIncludeLastday.trim();
    }

    public String getIsFixedRepaymentDay() {
        return isFixedRepaymentDay;
    }

    public void setIsFixedRepaymentDay(String isFixedRepaymentDay) {
        this.isFixedRepaymentDay = isFixedRepaymentDay == null ? null : isFixedRepaymentDay.trim();
    }

    public Date getFixedRepaymentDate() {
        return fixedRepaymentDate;
    }

    public void setFixedRepaymentDate(Date fixedRepaymentDate) {
        this.fixedRepaymentDate = fixedRepaymentDate;
    }

    public String getNotFullmonthRepaymentDay() {
        return notFullmonthRepaymentDay;
    }

    public void setNotFullmonthRepaymentDay(String notFullmonthRepaymentDay) {
        this.notFullmonthRepaymentDay = notFullmonthRepaymentDay == null ? null : notFullmonthRepaymentDay.trim();
    }

    public String getPenaltyCharge() {
        return penaltyCharge;
    }

    public void setPenaltyCharge(String penaltyCharge) {
        this.penaltyCharge = penaltyCharge == null ? null : penaltyCharge.trim();
    }

    public Integer getPenaltyChargeGraceDays() {
        return penaltyChargeGraceDays;
    }

    public void setPenaltyChargeGraceDays(Integer penaltyChargeGraceDays) {
        this.penaltyChargeGraceDays = penaltyChargeGraceDays;
    }

    public Float getPenaltyRate() {
        return penaltyRate;
    }

    public void setPenaltyRate(Float penaltyRate) {
        this.penaltyRate = penaltyRate;
    }

    public Integer getLateGraceDays() {
        return lateGraceDays;
    }

    public void setLateGraceDays(Integer lateGraceDays) {
        this.lateGraceDays = lateGraceDays;
    }

    public String getPaymentPlanInterestCalculationMethod() {
        return paymentPlanInterestCalculationMethod;
    }

    public void setPaymentPlanInterestCalculationMethod(String paymentPlanInterestCalculationMethod) {
        this.paymentPlanInterestCalculationMethod = paymentPlanInterestCalculationMethod == null ? null : paymentPlanInterestCalculationMethod.trim();
    }

    public String getPaymentPlanInterestHandleMethod() {
        return paymentPlanInterestHandleMethod;
    }

    public void setPaymentPlanInterestHandleMethod(String paymentPlanInterestHandleMethod) {
        this.paymentPlanInterestHandleMethod = paymentPlanInterestHandleMethod == null ? null : paymentPlanInterestHandleMethod.trim();
    }

    public String getPenaltyPenaltyHandMethod() {
        return penaltyPenaltyHandMethod;
    }

    public void setPenaltyPenaltyHandMethod(String penaltyPenaltyHandMethod) {
        this.penaltyPenaltyHandMethod = penaltyPenaltyHandMethod == null ? null : penaltyPenaltyHandMethod.trim();
    }

    public String getRecoverLessSterilisationRule() {
        return recoverLessSterilisationRule;
    }

    public void setRecoverLessSterilisationRule(String recoverLessSterilisationRule) {
        this.recoverLessSterilisationRule = recoverLessSterilisationRule == null ? null : recoverLessSterilisationRule.trim();
    }

    public String getRecoverMoreSterilisationRule() {
        return recoverMoreSterilisationRule;
    }

    public void setRecoverMoreSterilisationRule(String recoverMoreSterilisationRule) {
        this.recoverMoreSterilisationRule = recoverMoreSterilisationRule == null ? null : recoverMoreSterilisationRule.trim();
    }

    public String getProjectEndState() {
        return projectEndState;
    }

    public void setProjectEndState(String projectEndState) {
        this.projectEndState = projectEndState == null ? null : projectEndState.trim();
    }

    public String getCurrentAuditLink() {
        return currentAuditLink;
    }

    public void setCurrentAuditLink(String currentAuditLink) {
        this.currentAuditLink = currentAuditLink == null ? null : currentAuditLink.trim();
    }

    public String getLastAuditOpinion() {
        return lastAuditOpinion;
    }

    public void setLastAuditOpinion(String lastAuditOpinion) {
        this.lastAuditOpinion = lastAuditOpinion == null ? null : lastAuditOpinion.trim();
    }

    public String getResponsibleInvestigationState() {
        return responsibleInvestigationState;
    }

    public void setResponsibleInvestigationState(String responsibleInvestigationState) {
        this.responsibleInvestigationState = responsibleInvestigationState == null ? null : responsibleInvestigationState.trim();
    }

    public String getRiskInvestigationState() {
        return riskInvestigationState;
    }

    public void setRiskInvestigationState(String riskInvestigationState) {
        this.riskInvestigationState = riskInvestigationState == null ? null : riskInvestigationState.trim();
    }

    public String getPendingWillAllocateState() {
        return pendingWillAllocateState;
    }

    public void setPendingWillAllocateState(String pendingWillAllocateState) {
        this.pendingWillAllocateState = pendingWillAllocateState == null ? null : pendingWillAllocateState.trim();
    }

    public String getPayAuditState() {
        return payAuditState;
    }

    public void setPayAuditState(String payAuditState) {
        this.payAuditState = payAuditState == null ? null : payAuditState.trim();
    }

    public String getFileDataState() {
        return fileDataState;
    }

    public void setFileDataState(String fileDataState) {
        this.fileDataState = fileDataState == null ? null : fileDataState.trim();
    }

    public String getAuditState() {
        return auditState;
    }

    public void setAuditState(String auditState) {
        this.auditState = auditState == null ? null : auditState.trim();
    }

    public Integer getBusinessVariety() {
        return businessVariety;
    }

    public void setBusinessVariety(Integer businessVariety) {
        this.businessVariety = businessVariety;
    }

    public Date getDateOfApplication() {
        return dateOfApplication;
    }

    public void setDateOfApplication(Date dateOfApplication) {
        this.dateOfApplication = dateOfApplication;
    }

    public Date getRepaymentDate() {
        return repaymentDate;
    }

    public void setRepaymentDate(Date repaymentDate) {
        this.repaymentDate = repaymentDate;
    }

    public Integer getCalTail() {
        return calTail;
    }

    public void setCalTail(Integer calTail) {
        this.calTail = calTail;
    }

    public Integer getBaseInterestType() {
        return baseInterestType;
    }

    public void setBaseInterestType(Integer baseInterestType) {
        this.baseInterestType = baseInterestType;
    }

    public Float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Float interestRate) {
        this.interestRate = interestRate;
    }

    public Float getInterestRateFloating() {
        return interestRateFloating;
    }

    public void setInterestRateFloating(Float interestRateFloating) {
        this.interestRateFloating = interestRateFloating;
    }

    public Float getManagementRate() {
        return managementRate;
    }

    public void setManagementRate(Float managementRate) {
        this.managementRate = managementRate;
    }

    public Integer getCalInterestCycle() {
        return calInterestCycle;
    }

    public void setCalInterestCycle(Integer calInterestCycle) {
        this.calInterestCycle = calInterestCycle;
    }

    public Float getOverdueInterestRateFloat() {
        return overdueInterestRateFloat;
    }

    public void setOverdueInterestRateFloat(Float overdueInterestRateFloat) {
        this.overdueInterestRateFloat = overdueInterestRateFloat;
    }

    public String getInterestRateDescription() {
        return interestRateDescription;
    }

    public void setInterestRateDescription(String interestRateDescription) {
        this.interestRateDescription = interestRateDescription == null ? null : interestRateDescription.trim();
    }

    public Integer getLoanInvestment() {
        return loanInvestment;
    }

    public void setLoanInvestment(Integer loanInvestment) {
        this.loanInvestment = loanInvestment;
    }

    public Integer getLoanApplication() {
        return loanApplication;
    }

    public void setLoanApplication(Integer loanApplication) {
        this.loanApplication = loanApplication;
    }

    public Integer getInterestCharge() {
        return interestCharge;
    }

    public void setInterestCharge(Integer interestCharge) {
        this.interestCharge = interestCharge;
    }

    public Integer getInterestChargeReturn() {
        return interestChargeReturn;
    }

    public void setInterestChargeReturn(Integer interestChargeReturn) {
        this.interestChargeReturn = interestChargeReturn;
    }

    public String getMainCoordinator() {
        return mainCoordinator;
    }

    public void setMainCoordinator(String mainCoordinator) {
        this.mainCoordinator = mainCoordinator == null ? null : mainCoordinator.trim();
    }

    public String getAssistantCoordinator() {
        return assistantCoordinator;
    }

    public void setAssistantCoordinator(String assistantCoordinator) {
        this.assistantCoordinator = assistantCoordinator == null ? null : assistantCoordinator.trim();
    }

    public String getSupplementaryExplanation() {
        return supplementaryExplanation;
    }

    public void setSupplementaryExplanation(String supplementaryExplanation) {
        this.supplementaryExplanation = supplementaryExplanation == null ? null : supplementaryExplanation.trim();
    }

    public BigDecimal getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(BigDecimal creditAmount) {
        this.creditAmount = creditAmount;
    }

    public String getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(String creditLimit) {
        this.creditLimit = creditLimit == null ? null : creditLimit.trim();
    }

    public String getCurrentHanderInterest() {
        return currentHanderInterest;
    }

    public void setCurrentHanderInterest(String currentHanderInterest) {
        this.currentHanderInterest = currentHanderInterest == null ? null : currentHanderInterest.trim();
    }

    public String getIsRemote() {
        return isRemote;
    }

    public void setIsRemote(String isRemote) {
        this.isRemote = isRemote == null ? null : isRemote.trim();
    }

    public String getProjectManagerc() {
        return projectManagerc;
    }

    public void setProjectManagerc(String projectManagerc) {
        this.projectManagerc = projectManagerc == null ? null : projectManagerc.trim();
    }

    public String getRiskOfficer() {
        return riskOfficer;
    }

    public void setRiskOfficer(String riskOfficer) {
        this.riskOfficer = riskOfficer == null ? null : riskOfficer.trim();
    }

    public String getCapitalAmount() {
        return capitalAmount;
    }

    public void setCapitalAmount(String capitalAmount) {
        this.capitalAmount = capitalAmount == null ? null : capitalAmount.trim();
    }

    public BigDecimal getInDepositAmount() {
        return inDepositAmount;
    }

    public void setInDepositAmount(BigDecimal inDepositAmount) {
        this.inDepositAmount = inDepositAmount;
    }

    public BigDecimal getOutDepositAmount() {
        return outDepositAmount;
    }

    public void setOutDepositAmount(BigDecimal outDepositAmount) {
        this.outDepositAmount = outDepositAmount;
    }

    public BigDecimal getRealDepositAmount() {
        return realDepositAmount;
    }

    public void setRealDepositAmount(BigDecimal realDepositAmount) {
        this.realDepositAmount = realDepositAmount;
    }

    public BigDecimal getBackDepositAmount() {
        return backDepositAmount;
    }

    public void setBackDepositAmount(BigDecimal backDepositAmount) {
        this.backDepositAmount = backDepositAmount;
    }

    public String getSelectIds() {
        return selectIds;
    }

    public void setSelectIds(String selectIds) {
        this.selectIds = selectIds == null ? null : selectIds.trim();
    }

    public String getSelectNames() {
        return selectNames;
    }

    public void setSelectNames(String selectNames) {
        this.selectNames = selectNames == null ? null : selectNames.trim();
    }

    public BigDecimal getApplyAmount() {
        return applyAmount;
    }

    public void setApplyAmount(BigDecimal applyAmount) {
        this.applyAmount = applyAmount;
    }

    public Date getAuditTgDate() {
        return auditTgDate;
    }

    public void setAuditTgDate(Date auditTgDate) {
        this.auditTgDate = auditTgDate;
    }

    public Date getCreditStart() {
        return creditStart;
    }

    public void setCreditStart(Date creditStart) {
        this.creditStart = creditStart;
    }

    public Date getCreditEnd() {
        return creditEnd;
    }

    public void setCreditEnd(Date creditEnd) {
        this.creditEnd = creditEnd;
    }

    public String getTimeLimitType() {
        return timeLimitType;
    }

    public void setTimeLimitType(String timeLimitType) {
        this.timeLimitType = timeLimitType == null ? null : timeLimitType.trim();
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType == null ? null : projectType.trim();
    }

    public String getChangeStr() {
        return changeStr;
    }

    public void setChangeStr(String changeStr) {
        this.changeStr = changeStr == null ? null : changeStr.trim();
    }

    public String getProductSchemeId() {
        return productSchemeId;
    }

    public void setProductSchemeId(String productSchemeId) {
        this.productSchemeId = productSchemeId == null ? null : productSchemeId.trim();
    }

    public String getCommLoanerStr() {
        return commLoanerStr;
    }

    public void setCommLoanerStr(String commLoanerStr) {
        this.commLoanerStr = commLoanerStr == null ? null : commLoanerStr.trim();
    }

    public String getProductSchemeCode() {
        return productSchemeCode;
    }

    public void setProductSchemeCode(String productSchemeCode) {
        this.productSchemeCode = productSchemeCode == null ? null : productSchemeCode.trim();
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName == null ? null : borrowerName.trim();
    }

    public String getProductSchemeName() {
        return productSchemeName;
    }

    public void setProductSchemeName(String productSchemeName) {
        this.productSchemeName = productSchemeName == null ? null : productSchemeName.trim();
    }

    public String getChannelSide() {
        return channelSide;
    }

    public void setChannelSide(String channelSide) {
        this.channelSide = channelSide == null ? null : channelSide.trim();
    }

    public String getChannelRelevance() {
        return channelRelevance;
    }

    public void setChannelRelevance(String channelRelevance) {
        this.channelRelevance = channelRelevance == null ? null : channelRelevance.trim();
    }

    public String getBorrowCustomerSource() {
        return borrowCustomerSource;
    }

    public void setBorrowCustomerSource(String borrowCustomerSource) {
        this.borrowCustomerSource = borrowCustomerSource == null ? null : borrowCustomerSource.trim();
    }

    public String getBorrowerCard() {
        return borrowerCard;
    }

    public void setBorrowerCard(String borrowerCard) {
        this.borrowerCard = borrowerCard == null ? null : borrowerCard.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getRepaymentSource() {
        return repaymentSource;
    }

    public void setRepaymentSource(String repaymentSource) {
        this.repaymentSource = repaymentSource == null ? null : repaymentSource.trim();
    }

    public String getCarStyle() {
        return carStyle;
    }

    public void setCarStyle(String carStyle) {
        this.carStyle = carStyle == null ? null : carStyle.trim();
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName == null ? null : channelName.trim();
    }

    public String getChannelBankAccount() {
        return channelBankAccount;
    }

    public void setChannelBankAccount(String channelBankAccount) {
        this.channelBankAccount = channelBankAccount == null ? null : channelBankAccount.trim();
    }

    public BigDecimal getNakedCarPrice() {
        return nakedCarPrice;
    }

    public void setNakedCarPrice(BigDecimal nakedCarPrice) {
        this.nakedCarPrice = nakedCarPrice;
    }

    public BigDecimal getDownRepaymentPrice() {
        return downRepaymentPrice;
    }

    public void setDownRepaymentPrice(BigDecimal downRepaymentPrice) {
        this.downRepaymentPrice = downRepaymentPrice;
    }

    public String getBrokerageServerMethod() {
        return brokerageServerMethod;
    }

    public void setBrokerageServerMethod(String brokerageServerMethod) {
        this.brokerageServerMethod = brokerageServerMethod == null ? null : brokerageServerMethod.trim();
    }

    public BigDecimal getBrokerageServerRate() {
        return brokerageServerRate;
    }

    public void setBrokerageServerRate(BigDecimal brokerageServerRate) {
        this.brokerageServerRate = brokerageServerRate;
    }

    public String getRepayInterestMethod() {
        return repayInterestMethod;
    }

    public void setRepayInterestMethod(String repayInterestMethod) {
        this.repayInterestMethod = repayInterestMethod == null ? null : repayInterestMethod.trim();
    }

    public String getChannelServerMethod() {
        return channelServerMethod;
    }

    public void setChannelServerMethod(String channelServerMethod) {
        this.channelServerMethod = channelServerMethod == null ? null : channelServerMethod.trim();
    }

    public BigDecimal getChannelServerRate() {
        return channelServerRate;
    }

    public void setChannelServerRate(BigDecimal channelServerRate) {
        this.channelServerRate = channelServerRate;
    }

    public String getPneumaticServerMethod() {
        return pneumaticServerMethod;
    }

    public void setPneumaticServerMethod(String pneumaticServerMethod) {
        this.pneumaticServerMethod = pneumaticServerMethod == null ? null : pneumaticServerMethod.trim();
    }

    public BigDecimal getPneumaticServerRate() {
        return pneumaticServerRate;
    }

    public void setPneumaticServerRate(BigDecimal pneumaticServerRate) {
        this.pneumaticServerRate = pneumaticServerRate;
    }

    public BigDecimal getMarginRatio() {
        return marginRatio;
    }

    public void setMarginRatio(BigDecimal marginRatio) {
        this.marginRatio = marginRatio;
    }

    public String getMarginMethod() {
        return marginMethod;
    }

    public void setMarginMethod(String marginMethod) {
        this.marginMethod = marginMethod == null ? null : marginMethod.trim();
    }

    public BigDecimal getInvestorsYield() {
        return investorsYield;
    }

    public void setInvestorsYield(BigDecimal investorsYield) {
        this.investorsYield = investorsYield;
    }

    public BigDecimal getInvestorsYieldName() {
        return investorsYieldName;
    }

    public void setInvestorsYieldName(BigDecimal investorsYieldName) {
        this.investorsYieldName = investorsYieldName;
    }

    public BigDecimal getBorrowerCost() {
        return borrowerCost;
    }

    public void setBorrowerCost(BigDecimal borrowerCost) {
        this.borrowerCost = borrowerCost;
    }

    public BigDecimal getBorrowerCostName() {
        return borrowerCostName;
    }

    public void setBorrowerCostName(BigDecimal borrowerCostName) {
        this.borrowerCostName = borrowerCostName;
    }

    public String getPrepayment() {
        return prepayment;
    }

    public void setPrepayment(String prepayment) {
        this.prepayment = prepayment == null ? null : prepayment.trim();
    }

    public String getPrepaymentExplain() {
        return prepaymentExplain;
    }

    public void setPrepaymentExplain(String prepaymentExplain) {
        this.prepaymentExplain = prepaymentExplain == null ? null : prepaymentExplain.trim();
    }

    public String getGracePeriod() {
        return gracePeriod;
    }

    public void setGracePeriod(String gracePeriod) {
        this.gracePeriod = gracePeriod == null ? null : gracePeriod.trim();
    }

    public String getDebtConstraint() {
        return debtConstraint;
    }

    public void setDebtConstraint(String debtConstraint) {
        this.debtConstraint = debtConstraint == null ? null : debtConstraint.trim();
    }

    public String getProjectManager() {
        return projectManager;
    }

    public void setProjectManager(String projectManager) {
        this.projectManager = projectManager == null ? null : projectManager.trim();
    }

    public String getProjectAssistant() {
        return projectAssistant;
    }

    public void setProjectAssistant(String projectAssistant) {
        this.projectAssistant = projectAssistant == null ? null : projectAssistant.trim();
    }

    public String getProductManager() {
        return productManager;
    }

    public void setProductManager(String productManager) {
        this.productManager = productManager == null ? null : productManager.trim();
    }

    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId == null ? null : loanId.trim();
    }

    public String getLoanTitle() {
        return loanTitle;
    }

    public void setLoanTitle(String loanTitle) {
        this.loanTitle = loanTitle == null ? null : loanTitle.trim();
    }

    public String getQlrUserId() {
        return qlrUserId;
    }

    public void setQlrUserId(String qlrUserId) {
        this.qlrUserId = qlrUserId == null ? null : qlrUserId.trim();
    }

    public String getContractUrl() {
        return contractUrl;
    }

    public void setContractUrl(String contractUrl) {
        this.contractUrl = contractUrl == null ? null : contractUrl.trim();
    }

    public String getQlrApplyStatus() {
        return qlrApplyStatus;
    }

    public void setQlrApplyStatus(String qlrApplyStatus) {
        this.qlrApplyStatus = qlrApplyStatus == null ? null : qlrApplyStatus.trim();
    }

    public String getChannelSideId() {
        return channelSideId;
    }

    public void setChannelSideId(String channelSideId) {
        this.channelSideId = channelSideId == null ? null : channelSideId.trim();
    }

    public String getChannelRelevanceId() {
        return channelRelevanceId;
    }

    public void setChannelRelevanceId(String channelRelevanceId) {
        this.channelRelevanceId = channelRelevanceId == null ? null : channelRelevanceId.trim();
    }

    public String getLoanUseRemark() {
        return loanUseRemark;
    }

    public void setLoanUseRemark(String loanUseRemark) {
        this.loanUseRemark = loanUseRemark == null ? null : loanUseRemark.trim();
    }

    public String getGuaranteeMeasureRemark() {
        return guaranteeMeasureRemark;
    }

    public void setGuaranteeMeasureRemark(String guaranteeMeasureRemark) {
        this.guaranteeMeasureRemark = guaranteeMeasureRemark == null ? null : guaranteeMeasureRemark.trim();
    }
}