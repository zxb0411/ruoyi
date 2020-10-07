// 基于准备好的dom，初始化echarts实例
var myChart1 = echarts.init(document.getElementById('main1'));
var myChart2 = echarts.init(document.getElementById('main2'));
var myChart3 = echarts.init(document.getElementById('main3'));
var myChart4 = echarts.init(document.getElementById('main4'));
var myChart5 = echarts.init(document.getElementById('main5'));

var  famale= document.getElementById('boy1').value;
var  male= document.getElementById('boy2').value;
var  other= document.getElementById('boy0').value;
var  doctor= document.getElementById('history0').value;
var  master= document.getElementById('history1').value;
var  undergraduate= document.getElementById('history2').value;
var  specialty= document.getElementById('history3').value;

var  NEF= document.getElementById('levle0').value;
var  TOO= document.getElementById('levle1').value;
var  One= document.getElementById('levle2').value;
var  Two= document.getElementById('levle3').value;
var  a= document.getElementById('levle4').value;
var  b= document.getElementById('levle5').value;

//薪资
var  LESSFOUR= document.getElementById('range0').value;
var  FaS= document.getElementById('range1').value;
var  SaE= document.getElementById('range2').value;
var  EaT= document.getElementById('range3').value;
var  MORETEN= document.getElementById('range4').value;
//企业类型
var  privatelyoperated= document.getElementById('remake0').value;
var  stateownedenterprise= document.getElementById('remake1').value;
var  Incubator= document.getElementById('remake2').value;
var  Emerginghightech= document.getElementById('remake3').value;
var  foreigncapital= document.getElementById('remake4').value;
var  NONE= document.getElementById('remake5').value;


myChart1.setOption({
        show:true,
        title: {
        text: '企业对男女要求比例图',

    },
    legend: {},
    tooltip: {
        trigger: 'axis',
        showContent: true
    },
	series: [{
		name: '访问来源',

		type: 'pie', // 设置图表类型为饼图
		radius: '45%', // 饼图的半径，外半径为可视区尺寸（容器高宽中较小一项）的 55% 长度。
        label: {
            formatter: '{b}: {@2012} ({d}%)'
        },
		data: [ // 数据数组，name 为数据项名称，value 为数据项值
			{
				value: male,
				name: 'male'
			},
			{
				value: famale,
				name: 'famale'
			},
            {
                value: other,
                name: 'other'
            },


		]
	}]
})

myChart2.setOption({
    title: {
        text: '企业岗位薪资待遇比例图'
    },
    legend: {},
    tooltip: {
        trigger: 'axis',
        showContent:true
    },
	series: [{
		name: '访问来源',
		type: 'pie', // 设置图表类型为饼图
		radius: '45%', // 饼图的半径，外半径为可视区尺寸（容器高宽中较小一项）的 55% 长度。
        label: {
            formatter: '{b}: {@2012} ({d}%)'
        },
		data: [ // 数据数组，name 为数据项名称，value 为数据项值
			{
				value: LESSFOUR,
				name: '4k以下'
			},
			{
				value: FaS,
				name: '4-6k'
			},
			{
				value: SaE,
				name: '6-8k'
			},
			{
				value: EaT,
				name: '8-10k'
			},
			{
				value: MORETEN,
				name: '10k以上'
			}
		]
	}]
})
myChart3.setOption({
    title: {
        text: '企业性质比例图'
    },
    legend: {},
    tooltip: {
        trigger: 'axis',
        showContent:true
    },
	series: [{
		name: '访问来源',
		type: 'pie', // 设置图表类型为饼图
		radius: '45%', // 饼图的半径，外半径为可视区尺寸（容器高宽中较小一项）的 55% 长度。
        label: {
            formatter: '{b}: {@2012} ({d}%)'
        },
		data: [ // 数据数组，name 为数据项名称，value 为数据项值
			{
				value: privatelyoperated,
				name: '民营'
			},
			{
				value: stateownedenterprise,
				name: '国企'
			},
			{
				value: Incubator,
				name: '孵化器'
			},
			{
				value: Emerginghightech,
				name: '新兴高企'
			},
			{
				value: foreigncapital,
				name: '外资'
			},
			{
				value: NONE,
				name: '无'
			},
		]
	}]
})


var option = {
	
	title: {
		text: '企业招聘院校层次图'
	},
	tooltip: {},
	xAxis: {
		data: ["985", "211", "一批", "二批", "专科","高职"]
	},
	yAxis: {},
	series: [{
		name: '人数',
		type: 'bar',
		data: [ NEF,TOO, One, Two,a,b]
	}]
};
myChart4.setOption(option);





var option = {
	title: {
		text: '企业学历要求比例图'
	},
	tooltip: {},
	xAxis: {
		data: ["博士", "硕士", "本科", "专科"]
	},
	yAxis: {},
	series: [{
		name: '人数',
		type: 'bar',
		data: [doctor, master, undergraduate, specialty]
	}]
};
// 使用刚指定的配置项和数据显示图表。
myChart5.setOption(option);



