<template>
  <a-layout>
  <a-layout-sider width="200" style="background: #fff">
    <a-menu
        mode="inline"
        :default-selected-keys="['1']"
        :default-open-keys="['sub1']"
        :style="{ height: '100%', borderRight: 0 }"
    >
      <a-sub-menu key="sub1">

        <a-menu-item key="1">
          option1
        </a-menu-item>
        <a-menu-item key="2">
          option2
        </a-menu-item>
        <a-menu-item key="3">
          option3
        </a-menu-item>
        <a-menu-item key="4">
          option4
        </a-menu-item>
      </a-sub-menu>
      <a-sub-menu key="sub2">

        <a-menu-item key="5">
          option5
        </a-menu-item>
        <a-menu-item key="6">
          option6
        </a-menu-item>
        <a-menu-item key="7">
          option7
        </a-menu-item>
        <a-menu-item key="8">
          option8
        </a-menu-item>
      </a-sub-menu>
      <a-sub-menu key="sub3">

        <a-menu-item key="9">
          option9
        </a-menu-item>
        <a-menu-item key="10">
          option10
        </a-menu-item>
        <a-menu-item key="11">
          option11
        </a-menu-item>
        <a-menu-item key="12">
          option12
        </a-menu-item>
      </a-sub-menu>
    </a-menu>
  </a-layout-sider>

    <a-layout-content>
 <pre>
    {{JobJdbcDatasources}}
   {{sources}}
 </pre>

    </a-layout-content>

  </a-layout>


</template>

<script lang="ts">
import { defineComponent,onMounted,ref,reactive,toRef } from 'vue';
import axios from 'axios'



export default defineComponent({
  name: 'Home',
  setup() {
    console.log("setup");
    const JobJdbcDatasources=ref();
    const JobJdbcDatasources1=reactive({sources:[]});
    onMounted(() =>{
      console.log("onmounted");
      axios.get("http://localhost:8088/job").then((response) =>{
        const  data=response.data;
        JobJdbcDatasources.value=data.content;
        JobJdbcDatasources1.sources=data.content;
        console.log(response);
      });
    })
 return{
   JobJdbcDatasources,
   sources:toRef(JobJdbcDatasources1,"sources")

 }
  }

});
</script>
