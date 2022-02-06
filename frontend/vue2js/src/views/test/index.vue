<template>
  <div>
    <el-button type="primary" @click.native="Call_Info"
      >Get information from backend</el-button
    >
    <el-button type="warning" @click.native="info = null">Reset</el-button>
    <pre> you will see info below: </pre>
    <pre>{{ info }}</pre>
  </div>
</template>

<script>
import axios from 'axios'

export default {
  name: 'test',
  data() {
    return {
      info: 'initial state'
    }
  },
  methods: {
    Call_Info() {
      axios.get('http://localhost:9090/test/list').then((response) => {
        this.info = response.data
        console.log(response.data)
      })
    }
  }
}
</script>

<style scoped></style>
