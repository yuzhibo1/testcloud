/**
 * Created by lenovo on 2019/2/2.
 */
function hello() {
    $.ajax({
        type : "get",
        url : "http://localhost:9001/feign-customer1-refuse",    //请求发送到Servlet处
        dataType : "json",        //返回数据形式为json
        success : function(result) {
            //请求成功时执行该函数内容，result即为服务器返回的json对象
            if (result) {
                var names= result.names;
                var datas=result.values;
                //隐藏加载动画
                myChart.hideLoading();
                //加载数据图表
                myChart.setOption({
                    xAxis: {
                        data:names
                    },
                    series: [{
                        // 根据名字对应到相应的系列
                        data: datas
                    }]
                });
            }

        },
        error : function(errorMsg) {
            //请求失败时执行该函数
            alert("request data fail!");
            myChart.hideLoading();
        }
    });
}

window.setInterval(hello,1000);
