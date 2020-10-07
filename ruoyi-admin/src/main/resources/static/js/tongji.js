// 基于准备好的dom，初始化echarts实例
var myChart1 = echarts.init(document.getElementById('main1'));
var myChart2 = echarts.init(document.getElementById('main2'));
var myChart3 = echarts.init(document.getElementById('main3'));
var myChart4 = echarts.init(document.getElementById('main4'));
var myChart5 = echarts.init(document.getElementById('main5'));
var myChart6 = echarts.init(document.getElementById('main6'));

//通过th表达式取数
//获取性别
var male=document.getElementById('boy').value;
var famale=document.getElementById('girl').value;
//js肢解取model数
// var male = '[[${sexboy}]]';
// var famale = '[[${sexgirl}]]';

//获取院校级别
var JBV=document.getElementById('jbv').value;
var REE=document.getElementById('ree').value;
var YBB=document.getElementById('ybb').value;
var RBB=document.getElementById('rbb').value;
var ZK=document.getElementById('zk').value;
var GZ=document.getElementById('gz').value;

//获取院校级别
var Ppbs=document.getElementById('pbs').value;
var Ppss=document.getElementById('pss').value;
var Ppbk=document.getElementById('pbk').value;
var Ppzk=document.getElementById('pzk').value;

//获取外语水平
var EN4=document.getElementById('enf').value;
var EN6=document.getElementById('ens').value;
var JP2=document.getElementById('jptw').value;
var JP3=document.getElementById('jpth').value;
var NON=document.getElementById('non').value;

//获取薪资期望
var mIn=document.getElementById('MIN').value;
var lOw=document.getElementById('LOW').value;
var mId=document.getElementById('MID').value;
var mAx=document.getElementById('MAX').value;

//获取就业期望地
var YTZ=document.getElementById('yt').value;
var OTHERZ=document.getElementById('other').value;

myChart1.setOption({
    show:true,
    title: {
        text: '学生男女比例图'
    },
    legend: {},
    tooltip: {
        trigger: 'axis',
        showContent: true
    },
	series: [{
		name: '性别比例',
		type: 'pie', // 设置图表类型为饼图
		radius: '55%', // 饼图的半径，外半径为可视区尺寸（容器高宽中较小一项）的 55% 长度。
        label: {
            formatter: '{b}: {@2012} ({d}%)'
        },
		data: [ // 数据数组，name 为数据项名称，value 为数据项值
			{
				value: male,
				name: '男'
			},
			{
				value: famale,
				name: '女'
			},
			{
				value: 0,
				name: '其他'
			}
		]
	}]
})

var option = {
	title: {
		text: '学生院校层次图'
	},
	tooltip: {},
	legend: {
		data: ['人数']
	},
	xAxis: {
		data: ["985", "211", "一本", "二本", "专科", "高职"]
	},
	yAxis: {},
	series: [{
		name: '人数',
		type: 'bar',

		data: [JBV, REE, YBB, RBB, ZK, GZ]
	}]
};
myChart2.setOption(option);

var option = {
	title: {
		text: '学生学历图'
	},
	tooltip: {},
	legend: {
		data: ['人数']
	},
	xAxis: {
		data: ["博士", "硕士", "本科", "专科"]
	},
	yAxis: {},
	series: [{
		name: '人数',
		type: 'bar',
		data: [Ppbs, Ppss, Ppbk, Ppzk]
	}]
};
myChart3.setOption(option);

var app = {};
option = null;
option = {
    title: {
        left: 350,
        text: '学生语言程度',


    },
	tooltip: {
		trigger: 'item',
		formatter: '{a} <br/>{b}: {c} ({d}%)'
	},
	legend: {
		orient: 'vertical',
		left: 10,
		data: ['英语四级', '英语六级', '日语二级', '日语三级', '无']
	},
	series: [
		{
			name: '外语水平',
			type: 'pie',
			radius: ['50%', '70%'],
            label: {
                formatter: '{b}: {@2012} ({d}%)'
            },
			avoidLabelOverlap: false,
			label: {
				show: false,
				position: 'center'
			},
			emphasis: {
				label: {
					show: true,
					fontSize: '30',
					fontWeight: 'bold'
				}
			},
			labelLine: {
				show: false
			},
			data: [
				{value: EN4, name: '英语四级'},
				{value: EN6, name: '英语六级'},
				{value: JP2, name: '日语二级'},
				{value: JP3, name: '日语三级'},
				{value: NON, name: '无'}
			]
		}
	]
};
;
myChart4.setOption(option, true);

var app = {};
option = null;
option = {
    title: {
        text: '学生薪资待遇期望图'
    },
    tooltip: {
        trigger: 'item',
        showContent: true
    },
	xAxis: {
		type: 'category',
		boundaryGap: false,
		data: ['4K以下', '4-6K', '6-8K', '8K以上']
	},
	yAxis: {
		type: 'value'
	},
	series: [{
		data: [mIn, lOw, mId, mAx],
		type: 'line',
		areaStyle: {}
	}]
};
;

myChart5.setOption(option);

myChart6.setOption({
    title: {
        text: '学生就业期望地'
    },
    legend: {},
    tooltip: {
        trigger: 'axis',
        showContent: true
    },
	series: [{
        label: {
            formatter: '{b}: {@2012} ({d}%)'
        },
		name: '就业期望地',
		type: 'pie', // 设置图表类型为饼图
		radius: '55%', // 饼图的半径，外半径为可视区尺寸（容器高宽中较小一项）的 55% 长度。
		data: [ // 数据数组，name 为数据项名称，value 为数据项值
			{
				value: YTZ,
				name: '烟台'
			},
			{
				value: OTHERZ,
				name: '其他'
			}
		]
	}]
})