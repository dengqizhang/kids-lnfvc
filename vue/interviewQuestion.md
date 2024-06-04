# vue 面试题
vue2和vue3的区别：
1 API 差异：Vue 3引入了Composition API，这是一种新的API方式，允许开发者将同一逻辑功能的代码组织在同一个地方，而不是分散在各个API中，提高了代码的可读性和可维护性。相比之下，Vue 2使用的是Options API，即选项式API。
2 生命周期钩子：Vue 3不再推荐使用this变量，也不再使用Vue 2中的beforeCreate和created生命周期钩子。相反，Vue 3提供了新的生命周期钩子函数，并且移除了一些旧的API和特性，如Mixin和filters。
3根节点差异：Vue 3允许组件没有根节点，多个根节点会被默认包裹在一个fragment虚拟标签中，这有助于减少内存消耗。而Vue 2中必须要有根标签。
4 响应式系统：Vue 3的响应式系统更加灵活，能够监听所有对象和数组的变化，而Vue 2在响应式处理上有所不同。
5 性能优化：Vue 3在性能优化方面有所改进，包括首屏加载优化、更好的虚拟DOM实现等，以提供更快的渲染速度和更好的用户体验。
6 其他特性：Vue 3支持更多的特性，如Teleport（允许组件在任何位置渲染）、Suspense（用于异步组件的加载状态管理）等。此外，Vue 3的自定义渲染API允许开发者在细粒度上控制组件渲染行为。

vue2和vue3中的生命周期对比
vue2           ------->      vue3
 
beforeCreate   -------->      setup(()=>{})
created        -------->      setup(()=>{})
beforeMount    -------->      onBeforeMount(()=>{})
mounted        -------->      onMounted(()=>{})
beforeUpdate   -------->      onBeforeUpdate(()=>{})
updated        -------->      onUpdated(()=>{})
beforeDestroy  -------->      onBeforeUnmount(()=>{})
destroyed      -------->      onUnmounted(()=>{})
activated      -------->      onActivated(()=>{})
deactivated    -------->      onDeactivated(()=>{})
errorCaptured  -------->      onErrorCaptured(()=>{})
                              onRenderTracked
                              onRenderTriggered