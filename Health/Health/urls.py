"""Health URL Configuration

The `urlpatterns` list routes URLs to views. For more information please see:
    https://docs.djangoproject.com/en/2.1/topics/http/urls/
Examples:
Function views
    1. Add an import:  from my_app import views
    2. Add a URL to urlpatterns:  path('', views.home, name='home')
Class-based views
    1. Add an import:  from other_app.views import Home
    2. Add a URL to urlpatterns:  path('', Home.as_view(), name='home')
Including another URLconf
    1. Import the include() function: from django.urls import include, path
    2. Add a URL to urlpatterns:  path('blog/', include('blog.urls'))
"""
from django.contrib import admin
from django.urls import path, include
from . import views

urlpatterns = [
    path('admin/', admin.site.urls),
    path("",views.home),
    path("map2",views.hom),
    path("measles_prev",views.measles_prevention),
    path("measles_cur",views.measles_cure),
    path('review/', include('review.urls')),
    path('i18n/',include('django.conf.urls.i18n')),
    path('foodpos',views.food_pos),
    path('chickenpox',views.chickenpox_prev)
]
