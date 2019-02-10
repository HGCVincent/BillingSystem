<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
    <title>Title</title>
    <style>
        @page {
            size: A4;
        }
        body{
            font-family:Microsoft YaHei;
        }
        p{
            height:20px;
            margin:0 auto;
        }
        #tableMes tr{
            width:794px;
            height:14px;
        }
        #tableNote{
            font-size:10px;
        }
        #tableNote tr{
            width:794px;
            height:11px;
        }
        #tableitem tr{
            width:794px;
            height:35px;
        }
        #tableitem,#tableMes{
            width:180mm;
            font-size:12px;
        }
    </style>
</head>
<body>
<div>
    <table id="tableMes">
        <tr>
            <td><img src="LOGO.png"/></td>
        </tr>
        <tr>
            <td rowspan="12" width="50%">
                <div style="border: 1px solid #000;">
                    <table>
                        <tr>
                            <td>${Customer_Name}</td>
                        </tr>
                        <tr></tr>
                        <tr>
                            <td>${Address1}</td>
                        </tr>
                        <tr>
                            <td>${Address2}</td>
                        </tr>
                        <tr>
                            <td>${Address3}</td>
                        </tr>
                        <tr></tr>
                        <tr>
                            <td>敬呈:</td>
                        </tr>
                        <tr>
                            <td>${ATTN_Name}</td>
                        </tr>
                        <tr></tr>
                        <tr>
                            <td>${ATTN_Email}</td>
                        </tr>
                        <tr></tr>
                        <tr></tr>
                    </table>
                </div>
            </td>
            <td width="80px"></td>
            <td>账单号码:${CS_INVOICE_NUMBER}</td>
        </tr>
        <tr></tr>
        <tr>
            <td width="5%"></td>
            <td>账单日期:</td>
        </tr>
        <tr></tr>
        <tr>
            <td></td>
            <td>客户账号:</td>
        </tr>
        <tr>
            <td></td>
            <td>付款到期日:</td>
        </tr>
        <tr>
            <td></td>
            <td>币种:人民币</td>
        </tr>
        <tr></tr>
        <tr></tr>
        <tr>
            <td></td>
            <td>收款单位:牛牛科技（珠海）有限公司</td>
        </tr>
        <tr>
            <td></td>
            <td>收款银行:中国银行珠海高新科技园区支行</td>
        </tr>
        <tr>
            <td></td>
            <td>账号号码:679559406732</td>
        </tr>
        <tr></tr>
        <tr></tr>
        <tr>
            <td colspan="3">
                <h1 style="text-align:center; margin:0 auto">账单汇总</h1>
            </td>
        </tr>
        <tr>
            <th colspan="3">费用组合情况</th>
        </tr>
    </table>
    <table id="tableitem" border="0.5" cellpadding="0" cellspacing="0">
        <tr style="height:0; text-align: center;">
            <th width="55%">服务项目</th>
            <th width="15%">单价</th>
            <th width="15%">计费用量</th>
            <th width="15%">含税金额</th>
        </tr>
        ${Items}
        <tr>
            <th colspan="4" align="center">
                本期计费金额人民币合计:${Amounts}
            </th>
        </tr>
    </table>
    <table id="tableNote">
        <tr></tr>
        <tr><td>备注:${Bill_RefNo1}</td></tr>
        <tr></tr>
        <tr><th>重要提示:</th></tr>
        <tr><td>如果您对该帐单有任何疑问,请发送邮件到： CSINVOICE@cargosmart.com,我们会及时处理。 </td></tr>
    </table>

</div>
</body>
</html>