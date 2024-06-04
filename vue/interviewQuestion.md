# vue 面试题

vue2 和 vue3 的区别：
1 API 差异：Vue 3 引入了 Composition API，这是一种新的 API 方式，允许开发者将同一逻辑功能的代码组织在同一个地方，而不是分散在各个 API 中，提高了代码的可读性和可维护性。相比之下，Vue 2 使用的是 Options API，即选项式 API。
2 生命周期钩子：Vue 3 不再推荐使用 this 变量，也不再使用 Vue 2 中的 beforeCreate 和 created 生命周期钩子。相反，Vue 3 提供了新的生命周期钩子函数，并且移除了一些旧的 API 和特性，如 Mixin 和 filters。
3 根节点差异：Vue 3 允许组件没有根节点，多个根节点会被默认包裹在一个 fragment 虚拟标签中，这有助于减少内存消耗。而 Vue 2 中必须要有根标签。
4 响应式系统 ：Vue 3 的响应式系统更加灵活，能够监听所有对象和数组的变化，而 Vue 2 在响应式处理上有所不同。
5 性能优化：Vue 3 在性能优化方面有所改进，包括首屏加载优化、更好的虚拟 DOM 实现等，以提供更快的渲染速度和更好的用户体验。
6 其他特性：Vue 3 支持更多的特性，如 Teleport（允许组件在任何位置渲染）、Suspense（用于异步组件的加载状态管理）等。此外，Vue 3 的自定义渲染 API 允许开发者在细粒度上控制组件渲染行为。

vue2 和 vue3 中的生命周期对比
vue2 -------> vue3

beforeCreate --------> setup(()=>{})
created --------> setup(()=>{})
beforeMount --------> onBeforeMount(()=>{})
mounted --------> onMounted(()=>{})
beforeUpdate --------> onBeforeUpdate(()=>{})
updated --------> onUpdated(()=>{})
beforeDestroy --------> onBeforeUnmount(()=>{})
destroyed --------> onUnmounted(()=>{})
activated --------> onActivated(()=>{})
deactivated --------> onDeactivated(()=>{})
errorCaptured --------> onErrorCaptured(()=>{})
onRenderTracked
onRenderTriggered

- vue 有哪些特性或优点？

vue 的主要特性有，声明式渲染和响应式，声明式渲染可以描述输出的 html 和 js 状态之间的关系。

- vue 的响应式原理是怎么实现的？

  通过 ref 函数来声明响应式状态，当改变 ref 的值时，vue 会自动检测到这个值的变化，并相应更新 dom，通过 set 和 get 方法来追踪 ref 的值变化。

- vue 的 dom 更新时机是什么样的？

dom 更新不是同步的，无论进行多少次的状态修改，组件只会更新一次，如果想等待 dom 更新完成后再执行额外的代码，可以使用 nextTick()函数。

- computed 和 onMounted 有什么区别？

computed 是计算属性，用来描述依赖响应式状态的复杂逻辑，onMounted 是生命函数钩子，在组件挂载完成后执行。

- v-if 和 v-show 有什么区别

v-show 无论初始条件如何，始终会渲染，v-if 严格遵守条件渲染。

- v-if 和 v-for 在一起使用会出现什么问题？

二者优先级不明显，v-if 会首先执行，也就是说如果是 v-if 判断 v-for 的对象时，会存在找不到的情况，因为 v-if 先执行。

- 请你讲一下 watch 函数

watch 函数是声明一个监听器，监听响应式状态发生变化时，触发回调函数。

- vue 有几种传参方法？

父子传参，props，还有路由传参，还有全局的 emit 传参，pinia 也可以声明变量进行全局访问。

- 怎么声明路由守卫？

  使用 router.beforeEach

- 怎么使用路由来完成未登录时访问主页重定向到登录页

通过声明路由守卫，根据是否登录的条件，来配置返回到登录的路由地址。
