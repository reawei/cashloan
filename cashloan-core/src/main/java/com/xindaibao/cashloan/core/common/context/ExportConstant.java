package com.xindaibao.cashloan.core.common.context;

/**
 * 
 * TODO 后台列表数据导出 常量
 * @author
 * @date 2017年4月13日 下午14:40:52
 */
public final class ExportConstant {
	
	/** 导出暂定为5000条，如有需求，酌情更改*/
	/*** 分页起始*/
	public static final int STRAT_LIMIT = 0;
	
	/*** 分页结束*/
	public static final int END_LIMIT = 5000;
	
	/** 还款记录导出 表头*/
	public static final String[] EXPORT_REPAYLOG_LIST_HEARDERS = {"真实姓名","手机号码","订单号", "借款金额(元)","综合费用(元)","应还金额(元)","逾期天数","应还逾期罚金(元)","应还总额(元)","实还金额(元)", "实还逾期罚金(元)",  "实还总金额(元)'", 
	 "还款账号", "流水号", "还款方式", "应还款日期", "实际还款日期"};
	/** 还款记录导出 属性数组*/
	public static final String[] EXPORT_REPAYLOG_LIST_FIELDS = {"realName","phone","orderNo", "borrowAmount","fee","repayAmount", "penaltyDay","repayPenalty","repayTotal","repayLogAmount","penaltyAmout", "repayYesTotal",
	 "repayAccount", "serialNumber", "repayWay", "repayPlanTime", "repayTime"};

	/** 支付审核导出 表头*/
	public static final String[] EXPORT_REMITCHECKLOG_LIST_HEARDERS = {"LastName","Phone","Amount", "Borrow Time","cycle","scenes","status"};
	/** 支付审核导出 属性数组*/
	public static final String[] EXPORT_REMITCHECKLOG_LIST_FIELDS = {"lastName","mobile","balance", "createdTime","cycle","scenesStr", "statusStr"};

	/** 还款计划导出 表头*/
	public static final String[] EXPORT_REPAYLOGPLAN_LIST_HEARDERS = {"Real Name","Phone","Order Number", "Loan Amount","Overdue Fine","Actual Amount Received(KSh)","Total Amount Of Repayment(KSh)", "Due Time","Repayment Date",  "Actual Repayment Amount",
			"Repayment Status"};
	/** 还款计划导出 属性数组*/
	public static final String[] EXPORT_REPAYLOGPLAN_LIST_FIELDS = {"lastName","mobile","indentNo", "balanceBD","overdueFeeBD","actualBalanceBD", "repayTotalBD","shouldbackTime","lastbackTime","actualbackAmtBD","statusStr"};


	/** 借款订单导出 表头*/
	public static final String[] EXPORT_BORROW_LIST_HEARDERS = {"Actual name","Mobile","Indent Number","Balance(ksh)","Cycle","Created Time","Account Manage","Profit",
		"State","Loan time","Should Back Time","Repay Time","Actual Back Amount(ksh)","Penalty Day","Overdue Fee(ksh)","Export Time"};
	/** 借款订单导出 属性数组*/
	public static final String[] EXPORT_BORROW_LIST_FIELDS = {"lastName", "mobile", "indentNo", "balance","cycle","createdTime", "accountManage",
		"profit", "state","arriveTime", "shouldbackTime","repayTime", "actualbackAmt","penaltyDay","overdueFee","exportTime"};
	
	/** 支付记录导出 表头*/
	public static final String[] EXPORT_PAYLOG_LIST_HEARDERS = {"收款人姓名","手机号码","金额","收款银行卡","借款时间","打款时间","业务","状态"};
	/** 支付记录导出 属性数组*/
	public static final String[] EXPORT_PAYLOG_LIST_FIELDS = {"realName","loginName","amount","cardNo","loanTime","updateTime","scenesStr","stateStr"};
	
	/** 支付对账记录导出 表头*/
	public static final String[] EXPORT_PAYCHECK_LIST_HEARDERS = {"订单号","支付方式","订单金额","支付方订单金额","错误类型","对账记录添加时间","支付业务","处理方式","处理结果"};
	/** 支付对账记录导出 属性*/
	public static final String[] EXPORT_PAYCHECK_LIST_FIELDS = {"orderNo","payTypeStr","orderAmount","realPayAmount","typeStr","processTime",
		"scenesStr","processWayStr","processResultStr",};
	
	/** 已逾期订单导出 表头*/
	public static final String[] EXPORT_OVERDUE_LIST_HEARDERS = {"真实姓名","手机号","订单号","借款金额(元)","借款期限(天)","订单生成时间","综合费用(元)","居间服务费(元)","信息认证费(元)","利息(元)",
		"实际到账金额","订单状态","借款地址","放款时间","逾期天数","逾期罚金(元)","逾期等级"};
	/** 已逾期订单导出 属性数组*/
	public static final String[] EXPORT_OVERDUE_LIST_FIELDS = {"realName", "phone", "orderNo", "amount","timeLimit","createTime", "fee",
		"serviceFee","infoAuthFee","interest","realAmount", "state", "address", "loanTime","penaltyDay","penaltyAmout","level"};
	
	/** 已坏账订单导出 表头*/
	public static final String[] EXPORT_BADDEBT_LIST_HEARDERS = {"真实姓名","手机号","订单号","借款金额(元)","借款期限","订单生成时间","综合费用","居间服务费","信息认证费","利息",
		"实际到账金额","订单状态","借款地址","放款时间","实际还款时间","实际还款金额(元)","逾期天数","逾期罚金(元)"};
	/** 已坏账订单导出 属性数组*/
	public static final String[] EXPORT_BADDEBT_LIST_FIELDS = {"realName", "phone", "orderNo", "amount","timeLimit","createTime", "fee",
		"serviceFee","infoAuthFee","interest","realAmount", "state", "address", "loanTime", "repayTime", "repayAmount","penaltyDay","penaltyAmout"};
	
	/** 催收订单导出 表头*/
	public static final String[] EXPORT_REPAYORDER_LIST_HEARDERS = {"真实姓名","手机号码","订单号","贷款金额","借款时间","预计还款时间","借款期限(天)","逾期天数","逾期等级","罚息","催收人","订单状态"};
	/** 催收订单导出 属性*/
	public static final String[] EXPORT_REPAYORDER_LIST_FIELDS = {"borrowName","phone","orderNo","amount","borrowTime","repayTime","timeLimit","penaltyDay","level",
		"penaltyAmout","userName","state"};
	
	/** 催收反馈导出 表头*/
	public static final String[] EXPORT_URGELOG_LIST_HEARDERS = {"借款人姓名","订单号","手机号码","金额","借款时间","预计还款时间","逾期天数","逾期等级","罚息","催收人","订单状态",
		"催收方式","承诺还款时间","催收反馈","催收时间"};
	/** 催收反馈导出 属性*/
	public static final String[] EXPORT_URGELOG_LIST_FIELDS = {"borrowName","orderNo","phone","amount","borrowTime","repayTime","penaltyDay","level",
		"penaltyAmout","userName","state","way","promiseTime","remark","createTime"};
	
	/** 同盾审核记录导出 表头*/
	public static final String[] EXPORT_TONGDUNLOG_LIST_HEARDERS = {"真实姓名","手机号码","借款订单号","借款金额","风险报告编码","申请状态",
		"提交审核报告结果编码","提交审核返回信息","提交审核报告时间","查询审核报告结果编码","查询审核报告信息","风险结果","风险分数","查询审核报告时间"};
	/** 同盾审核记录导出 属性*/
	public static final String[] EXPORT_TONGDUNLOG_LIST_FIELDS = {"realName","phone","borrowNo","amount","reportId","stateStr",
		"submitCode","submitParams","createTime","queryCode","queryParams","rsState","rsScore","updateTime"};
}
