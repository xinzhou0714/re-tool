<template>
  <div>
    <el-form class="login-container" label-position="left" label-width="0px">
      <h3 class="login_title">Sign In</h3>
      <el-form-item>
        <el-input
          type="text"
          v-model="loginForm.username"
          auto-complete="off"
          placeholder="username"
        ></el-input>
      </el-form-item>
      <el-form-item>
        <el-input
          type="password"
          v-model="loginForm.password"
          auto-complete="off"
          placeholder="password"
        ></el-input>
      </el-form-item>
      <el-form-item style="width: 100%">
        <el-button
          type="primary"
          style="width: 100%; background: #505458; border: none"
          v-on:click="handleLogin"
          >Login
        </el-button>
      </el-form-item>
    </el-form>
    <pre>{{ msg }}</pre>
  </div>
</template>

<script>
export default {
  name: 'login',
  data() {
    return {
      loginForm: {
        username: '',
        password: ''
      },
      msg: 'a'
    }
  },
  methods: {
    handleLogin() {
      this.$axios
        .post('/user/login', {
          username: this.loginForm.username,
          password: this.loginForm.password
        })
        .then((response) => {
          this.msg = response
          console.log(response)
        })
    }
  }
}
</script>

<style scoped></style>
