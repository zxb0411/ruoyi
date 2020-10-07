// 基于准备好的dom，初始化echarts实例
var myChart1 = echarts.init(document.getElementById('main1'));



var a=document.getElementById('sex0').value;
var b=document.getElementById('sex1').value;

var c=document.getElementById('profession0').value;
var d=document.getElementById('profession1').value;


var e=document.getElementById('history0').value;
var f=document.getElementById('history1').value;


var g=document.getElementById('level0').value;
var h=document.getElementById('level1').value;

var i=document.getElementById('range0').value;
var j=document.getElementById('range1').value;


var k=document.getElementById('position0').value;
var l=document.getElementById('position1').value;



var m=document.getElementById('city0').value;
var n=document.getElementById('city1').value;


var option = {
    title: {
        text: '匹配统计',
    },
    tooltip: {
        trigger: 'axis'
    },
    legend: {
        data: ['匹配', '不匹配']
    },
    toolbox: {
        show: true,
        feature: {
            dataView: {show: true, readOnly: false},
            magicType: {show: true, type: ['line', 'bar']},
            restore: {show: true},
            saveAsImage: {show: true}
        }
    },
    calculable: true,
    xAxis: [
        {
            type: 'category',
            data: ['性别', '学校层次', '专业', '学历', '期望薪资', '期望岗位', '就业印象地']
        }
    ],
    yAxis: [
        {
            type: 'value'
        }
    ],
    series: [
        {
            name: '匹配',
            type: 'bar',
            data: [a, c, e, g, i, k, m ],
            markPoint: {

            },

        },
        {
            name: '不匹配',
            type: 'bar',
            data: [b,d,f,h,j,l,n],
            markPoint: {

            },

        }
    ]
};
myChart1.setOption(option);