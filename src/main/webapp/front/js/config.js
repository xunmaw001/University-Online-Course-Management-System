
var projectName = '高校网课管理系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的发布',
	url: '../forum/list-my.html'
},

]


var indexNav = [

{
	name: '课表信息',
	url: './pages/kebiaoxinxi/list.html'
}, 
{
	name: '课堂信息',
	url: './pages/ketangxinxi/list.html'
}, 
{
	name: '作业信息',
	url: './pages/zuoyexinxi/list.html'
}, 
{
	name: '课程考核',
	url: './pages/kechengkaohe/list.html'
}, 

{
	name: '论坛信息',
	url: './pages/forum/list.html'
}, 
]

var adminurl =  "http://localhost:8080/ssm89e6v/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["查看","修改","删除"],"menu":"学生","menuJump":"列表","tableName":"xuesheng"}],"menu":"学生管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"教师","menuJump":"列表","tableName":"jiaoshi"}],"menu":"教师管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"教务人员","menuJump":"列表","tableName":"jiaowurenyuan"}],"menu":"教务人员管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"课表信息","menuJump":"列表","tableName":"kebiaoxinxi"}],"menu":"课表信息管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"调课信息","menuJump":"列表","tableName":"diaokexinxi"}],"menu":"调课信息管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"缓修信息","menuJump":"列表","tableName":"huanxiuxinxi"}],"menu":"缓修信息管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"课堂信息","menuJump":"列表","tableName":"ketangxinxi"}],"menu":"课堂信息管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"课堂签到","menuJump":"列表","tableName":"ketangqiandao"}],"menu":"课堂签到管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"课堂记录","menuJump":"列表","tableName":"ketangjilu"}],"menu":"课堂记录管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"作业信息","menuJump":"列表","tableName":"zuoyexinxi"}],"menu":"作业信息管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"作业提交","menuJump":"列表","tableName":"zuoyetijiao"}],"menu":"作业提交管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"考核记录","menuJump":"列表","tableName":"kaohejilu"}],"menu":"考核记录管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"课程考核","menuJump":"列表","tableName":"kechengkaohe"}],"menu":"课程考核管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"缓考申请","menuJump":"列表","tableName":"huankaoshenqing"}],"menu":"缓考申请管理"},{"child":[{"buttons":["查看","修改","删除","报表"],"menu":"课程统计","menuJump":"列表","tableName":"kechengtongji"}],"menu":"课程统计管理"},{"child":[{"buttons":["查看","修改","删除","报表"],"menu":"考试统计","menuJump":"列表","tableName":"kaoshitongji"}],"menu":"考试统计管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"论坛管理","tableName":"forum"}],"menu":"论坛管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看","缓修"],"menu":"课表信息列表","menuJump":"列表","tableName":"kebiaoxinxi"}],"menu":"课表信息模块"},{"child":[{"buttons":["查看","签到"],"menu":"课堂信息列表","menuJump":"列表","tableName":"ketangxinxi"}],"menu":"课堂信息模块"},{"child":[{"buttons":["查看","提交作业"],"menu":"作业信息列表","menuJump":"列表","tableName":"zuoyexinxi"}],"menu":"作业信息模块"},{"child":[{"buttons":["查看","申请"],"menu":"课程考核列表","menuJump":"列表","tableName":"kechengkaohe"}],"menu":"课程考核模块"}],"roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看","删除"],"menu":"缓修信息","menuJump":"列表","tableName":"huanxiuxinxi"}],"menu":"缓修信息管理"},{"child":[{"buttons":["查看"],"menu":"课堂签到","menuJump":"列表","tableName":"ketangqiandao"}],"menu":"课堂签到管理"},{"child":[{"buttons":["查看","删除"],"menu":"作业提交","menuJump":"列表","tableName":"zuoyetijiao"}],"menu":"作业提交管理"}],"frontMenu":[{"child":[{"buttons":["查看","缓修"],"menu":"课表信息列表","menuJump":"列表","tableName":"kebiaoxinxi"}],"menu":"课表信息模块"},{"child":[{"buttons":["查看","签到"],"menu":"课堂信息列表","menuJump":"列表","tableName":"ketangxinxi"}],"menu":"课堂信息模块"},{"child":[{"buttons":["查看","提交作业"],"menu":"作业信息列表","menuJump":"列表","tableName":"zuoyexinxi"}],"menu":"作业信息模块"},{"child":[{"buttons":["查看","申请"],"menu":"课程考核列表","menuJump":"列表","tableName":"kechengkaohe"}],"menu":"课程考核模块"}],"roleName":"学生","tableName":"xuesheng"},{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"调课信息","menuJump":"列表","tableName":"diaokexinxi"}],"menu":"调课信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"课堂信息","menuJump":"列表","tableName":"ketangxinxi"}],"menu":"课堂信息管理"},{"child":[{"buttons":["查看"],"menu":"课堂签到","menuJump":"列表","tableName":"ketangqiandao"}],"menu":"课堂签到管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"课堂记录","menuJump":"列表","tableName":"ketangjilu"}],"menu":"课堂记录管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"作业信息","menuJump":"列表","tableName":"zuoyexinxi"}],"menu":"作业信息管理"},{"child":[{"buttons":["查看","删除"],"menu":"作业提交","menuJump":"列表","tableName":"zuoyetijiao"}],"menu":"作业提交管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"考核记录","menuJump":"列表","tableName":"kaohejilu"}],"menu":"考核记录管理"}],"frontMenu":[{"child":[{"buttons":["查看","缓修"],"menu":"课表信息列表","menuJump":"列表","tableName":"kebiaoxinxi"}],"menu":"课表信息模块"},{"child":[{"buttons":["查看","签到"],"menu":"课堂信息列表","menuJump":"列表","tableName":"ketangxinxi"}],"menu":"课堂信息模块"},{"child":[{"buttons":["查看","提交作业"],"menu":"作业信息列表","menuJump":"列表","tableName":"zuoyexinxi"}],"menu":"作业信息模块"},{"child":[{"buttons":["查看","申请"],"menu":"课程考核列表","menuJump":"列表","tableName":"kechengkaohe"}],"menu":"课程考核模块"}],"roleName":"教师","tableName":"jiaoshi"},{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"课表信息","menuJump":"列表","tableName":"kebiaoxinxi"}],"menu":"课表信息管理"},{"child":[{"buttons":["查看","审核"],"menu":"调课信息","menuJump":"列表","tableName":"diaokexinxi"}],"menu":"调课信息管理"},{"child":[{"buttons":["查看","审核"],"menu":"缓修信息","menuJump":"列表","tableName":"huanxiuxinxi"}],"menu":"缓修信息管理"},{"child":[{"buttons":["查看"],"menu":"课堂记录","menuJump":"列表","tableName":"ketangjilu"}],"menu":"课堂记录管理"},{"child":[{"buttons":["查看"],"menu":"考核记录","menuJump":"列表","tableName":"kaohejilu"}],"menu":"考核记录管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"课程考核","menuJump":"列表","tableName":"kechengkaohe"}],"menu":"课程考核管理"},{"child":[{"buttons":["查看","审核"],"menu":"缓考申请","menuJump":"列表","tableName":"huankaoshenqing"}],"menu":"缓考申请管理"},{"child":[{"buttons":["新增","查看","修改","删除","报表"],"menu":"课程统计","menuJump":"列表","tableName":"kechengtongji"}],"menu":"课程统计管理"},{"child":[{"buttons":["新增","查看","修改","删除","报表"],"menu":"考试统计","menuJump":"列表","tableName":"kaoshitongji"}],"menu":"考试统计管理"}],"frontMenu":[{"child":[{"buttons":["查看","缓修"],"menu":"课表信息列表","menuJump":"列表","tableName":"kebiaoxinxi"}],"menu":"课表信息模块"},{"child":[{"buttons":["查看","签到"],"menu":"课堂信息列表","menuJump":"列表","tableName":"ketangxinxi"}],"menu":"课堂信息模块"},{"child":[{"buttons":["查看","提交作业"],"menu":"作业信息列表","menuJump":"列表","tableName":"zuoyexinxi"}],"menu":"作业信息模块"},{"child":[{"buttons":["查看","申请"],"menu":"课程考核列表","menuJump":"列表","tableName":"kechengkaohe"}],"menu":"课程考核模块"}],"roleName":"教务人员","tableName":"jiaowurenyuan"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
