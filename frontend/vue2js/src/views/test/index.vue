<template>
  <div>
    <el-button type="primary" @click.native="Call_Info"
      >Get information from backend</el-button
    >
    <el-button type="warning" @click.native="info=null">Reset</el-button>
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
      axios
        .get('https://api.coindesk.com/v1/bpi/currentprice.json')
        .then((response) => (this.info = response.data.bpi))
      console.log('aaa')
    }
  }
}
</script>

<style scoped></style>
