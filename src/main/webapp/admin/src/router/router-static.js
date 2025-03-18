import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import ketangjilu from '@/views/modules/ketangjilu/list'
    import jiaowurenyuan from '@/views/modules/jiaowurenyuan/list'
    import xuesheng from '@/views/modules/xuesheng/list'
    import kaoshitongji from '@/views/modules/kaoshitongji/list'
    import diaokexinxi from '@/views/modules/diaokexinxi/list'
    import kaohejilu from '@/views/modules/kaohejilu/list'
    import jiaoshi from '@/views/modules/jiaoshi/list'
    import ketangqiandao from '@/views/modules/ketangqiandao/list'
    import zuoyetijiao from '@/views/modules/zuoyetijiao/list'
    import kebiaoxinxi from '@/views/modules/kebiaoxinxi/list'
    import zuoyexinxi from '@/views/modules/zuoyexinxi/list'
    import ketangxinxi from '@/views/modules/ketangxinxi/list'
    import kechengkaohe from '@/views/modules/kechengkaohe/list'
    import forum from '@/views/modules/forum/list'
    import huankaoshenqing from '@/views/modules/huankaoshenqing/list'
    import kechengtongji from '@/views/modules/kechengtongji/list'
    import config from '@/views/modules/config/list'
    import huanxiuxinxi from '@/views/modules/huanxiuxinxi/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
          ,{
	path: '/ketangjilu',
        name: '课堂记录',
        component: ketangjilu
      }
          ,{
	path: '/jiaowurenyuan',
        name: '教务人员',
        component: jiaowurenyuan
      }
          ,{
	path: '/xuesheng',
        name: '学生',
        component: xuesheng
      }
          ,{
	path: '/kaoshitongji',
        name: '考试统计',
        component: kaoshitongji
      }
          ,{
	path: '/diaokexinxi',
        name: '调课信息',
        component: diaokexinxi
      }
          ,{
	path: '/kaohejilu',
        name: '考核记录',
        component: kaohejilu
      }
          ,{
	path: '/jiaoshi',
        name: '教师',
        component: jiaoshi
      }
          ,{
	path: '/ketangqiandao',
        name: '课堂签到',
        component: ketangqiandao
      }
          ,{
	path: '/zuoyetijiao',
        name: '作业提交',
        component: zuoyetijiao
      }
          ,{
	path: '/kebiaoxinxi',
        name: '课表信息',
        component: kebiaoxinxi
      }
          ,{
	path: '/zuoyexinxi',
        name: '作业信息',
        component: zuoyexinxi
      }
          ,{
	path: '/ketangxinxi',
        name: '课堂信息',
        component: ketangxinxi
      }
          ,{
	path: '/kechengkaohe',
        name: '课程考核',
        component: kechengkaohe
      }
          ,{
	path: '/forum',
        name: '论坛管理',
        component: forum
      }
          ,{
	path: '/huankaoshenqing',
        name: '缓考申请',
        component: huankaoshenqing
      }
          ,{
	path: '/kechengtongji',
        name: '课程统计',
        component: kechengtongji
      }
          ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
          ,{
	path: '/huanxiuxinxi',
        name: '缓修信息',
        component: huanxiuxinxi
      }
        ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
