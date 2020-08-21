<#include "base.ftl">
<#macro html title="" cssLibraries=[] csses=[] scriptLibraries=[] scripts=[]>
<@htmlhead title=title cssLibraries=cssLibraries csses=csses/>
<@htmlbody scriptLibraries=scriptLibraries scripts=scripts>
<nav class="navbar navbar-expand-sm navbar-dark bg-dark">
  <a class="navbar-brand" href="#">商城</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExample03" aria-controls="navbarsExample03" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarsExample03">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="#">商家 <span class="sr-only">商家</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">注册</a>
      </li>
      <li class="nav-item">
        <a class="nav-link disabled" href="#">分类</a>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="dropdown03" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">分类</a>
        <div class="dropdown-menu" aria-labelledby="dropdown03">
          <a class="dropdown-item" href="#">添加分类</a>
          <a class="dropdown-item" href="#">查询分类</a>
          <a class="dropdown-item" href="#">删除分类</a>
        </div>
      </li>
    </ul>
    <form class="form-inline my-2 my-md-0">
      <input class="form-control" type="text" placeholder="Search">
    </form>
  </div>
</nav>
 <#nested>
</@htmlbody>
</#macro>