const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm5gd2j/",
            name: "ssm5gd2j",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm5gd2j/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "校园生活电子商城"
        } 
    }
}
export default base
