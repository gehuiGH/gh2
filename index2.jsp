<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>首页</title>

<link href="https://www.bootcss.com/p/layoutit/css/bootstrap-combined.min.css" rel="stylesheet">
 
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
 
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="https://www.bootcss.com/p/layoutit/js/bootstrap.min.js"></script>

</head>
<body>

                <div class="navbar">
                  <div class="navbar-inner">
                    <div class="container-fluid"> <a data-target=".navbar-responsive-collapse" data-toggle="collapse" class="btn btn-navbar"> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </a> <a href="#" class="brand" contenteditable="true">休闲俱乐部</a>
                      <div class="nav-collapse collapse navbar-responsive-collapse">
                        <ul class="nav" contenteditable="true">
                          <li class="active"><a href="#">主页</a></li>
                          <li>
                          	

                          </li>
                          <li><a href="#">链接</a></li>
                          <li class="dropdown"> <a data-toggle="dropdown" class="dropdown-toggle" href="#">下拉菜单 <b class="caret"></b></a>
                            <ul class="dropdown-menu">
                              <li><a href="#">下拉导航1</a></li>
                              <li><a href="#">下拉导航2</a></li>
                              <li><a href="#">其他</a></li>
                              <li class="divider"></li>
                              <li class="nav-header">标签</li>
                              <li><a href="#">链接1</a></li>
                              <li><a href="#">链接2</a></li>
                            </ul>
                          </li>
                        </ul>
                        <ul class="nav pull-right" contenteditable="true">
                          <li>
                          <font size="+1" color="red">欢迎用户>>></font>
                          		<%
                          		String user= (String)request.getSession().getAttribute("use");
                          		out.print(user);
                          		%>
                 			<font size="+1" color="red"><<<</font>
                          		</li>
                           		
                          <li class="divider-vertical"></li>
                          <li class="dropdown"> <a data-toggle="dropdown" class="dropdown-toggle" href="#"> 下拉菜单 <b class="caret"></b></a>
                            <ul class="dropdown-menu">
                              <li><a href="#">下拉导航1</a></li>
                              <li><a href="#">下拉导航2</a></li>
                              <li><a href="#">其他</a></li>
                              <li class="divider"></li>
                              <li><a href="#">链接3</a></li>
                            </ul>
                          </li>
                        </ul>
                      </div>
                      <!-- /.nav-collapse --> 
                    </div>
                  </div>
                  <!-- /navbar-inner --> 
                </div>
              
                <ul class="thumbnails">
                  <li class="span4">
                    <div class="thumbnail"> <img alt="300x200" src="img/002.jpeg">
                      <div class="caption" contenteditable="true">
                        <h3>冯诺尔曼结构</h3>
                        <p>也称普林斯顿结构，是一种将程序指令存储器和数据存储器合并在一起的存储器结构。程序指令存储地址和数据存储地址指向同一个存储器的不同物理位置。</p>
                        <p><a class="btn btn-primary" href="#">浏览</a> <a class="btn" href="#">分享</a></p>
                      </div>
                    </div>
                  </li>
                  <li class="span4">
                    <div class="thumbnail"> <img alt="300x200" src="img/002.png">
                      <div class="caption" contenteditable="true">
                        <h3>哈佛结构</h3>
                        <p>哈佛结构是一种将程序指令存储和数据存储分开的存储器结构，它的主要特点是将程序和数据存储在不同的存储空间中，进行独立编址。</p>
                        <p><a class="btn btn-primary" href="#">浏览</a> <a class="btn" href="#">分享</a></p>
                      </div>
                    </div>
                  </li>
                  <li class="span4">
                    <div class="thumbnail"> <img alt="300x200" src="img/003.jpg">
                      <div class="caption" contenteditable="true">
                        <h3>改进型哈佛结构</h3>
                        <p>改进型的哈佛结构具有一条独立的地址总线和一条独立的数据总线，两条总线由程序存储器和数据存储器分时复用，使结构更紧凑。</p>
                        <p><a class="btn btn-primary" href="#">浏览</a> <a class="btn" href="#">分享</a></p>
                      </div>
                    </div>
                  </li>
                   
                </ul>
              
                <div class="carousel slide" id="carousel-190607">
                  <ol class="carousel-indicators">
                    <li class="" data-slide-to="0" data-target="#carousel-190607"></li>
                    <li data-slide-to="1" data-target="#carousel-190607" class=""></li>
                    <li data-slide-to="2" data-target="#carousel-190607" class="active"></li>
                  </ol>
                  <div class="carousel-inner">
                    <div class="item"> <img alt="" src="img/1.jpg">
                      <div class="carousel-caption" contenteditable="true">
                        <h4>棒球</h4>
                        <p>棒球运动是一种以棒打球为主要特点，集体性、对抗性很强的球类运动项目，在美国、日本尤为盛行。</p>
                      </div>
                    </div>
                    <div class="item"> <img alt="" src="img/2.jpg">
                      <div class="carousel-caption" contenteditable="true">
                        <h4>冲浪</h4>
                        <p>冲浪是以海浪为动力，利用自身的高超技巧和平衡能力，搏击海浪的一项运动。运动员站立在冲浪板上，或利用腹板、跪板、充气的橡皮垫、划艇、皮艇等驾驭海浪的一项水上运动。</p>
                      </div>
                    </div>
                    <div class="item active"> <img alt="" src="img/3.jpg">
                      <div class="carousel-caption" contenteditable="true">
                        <h4>自行车</h4>
                        <p>以自行车为工具比赛骑行速度的体育运动。1896年第一届奥林匹克运动会上被列为正式比赛项目。环法赛为最著名的世界自行车锦标赛。</p>
                      </div>
                    </div>
                  </div>
                  <a data-slide="prev" href="#carousel-190607" class="left carousel-control">‹</a> <a data-slide="next" href="#carousel-190607" class="right carousel-control">›</a> </div>
              
                <div class="pagination pagination-centered">
                  <ul contenteditable="true">
                    <li><a href="#">上一页</a></li>
                    <li><a href="#">1</a></li>
                    <li><a href="#">2</a></li>
                    <li><a href="#">3</a></li>
                    <li><a href="#">4</a></li>
                    <li><a href="#">5</a></li>
                    <li><a href="#">下一页</a></li>
                  </ul>
                </div>
              
	
</body>
</html>