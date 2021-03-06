import numpy as np
from PIL import Image  # 导入PIL模块中的Image对象
import wordcloud  # 导入词云模块
import matplotlib.pyplot as plt
import os
import jieba
from wordcloud import ImageColorGenerator

file_name = "libai.txt";
pic_name = "libai.png";
# 判断文件是否存在
if os.path.exists(file_name):
    with open(file_name, "r") as file:  # 读取文件
        content = file.read()
        if content:  # 判断文本内容是否为空
            # 进行分词处理c 返回的是一个对象 需要使用"".join进行拼接
            cut_text = jieba.cut(content)
            word = " ".join(cut_text)  # 拼接
    img = np.array(Image.open(pic_name))  # 读取图片
    img_colors = ImageColorGenerator(img)
    # 生成词云图
    # mask: 置顶遮罩图 img
    # font_path: 设置字体
    # background_color: 设置背景颜色
    wd = wordcloud.WordCloud(mask=img, font_path="simhei.ttf", background_color="white")
    wd.generate(word)  # 生成词云图
    # 显示词云图
    plt.imshow(wd.recolor(color_func=img_colors), interpolation="bilinear")
    plt.axis("off")  # 关闭显示x轴/y轴下标
    plt.savefig("elsa_cy.png")  # 保存词云图到本地
    plt.show()
else:
    print("大哥，你在逗我吗，没文件我咋读勒！")
