USE [onlineEnglish]
GO
/****** Object:  Table [dbo].[Tb_Theme]    Script Date: 07/08/2019 22:09:56 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Tb_Theme](
	[id_theme] [int] IDENTITY(1,1) NOT NULL,
	[descript_theme] [nvarchar](255) NULL,
	[image_descript_theme] [nvarchar](255) NULL,
	[name_theme] [nvarchar](255) NOT NULL,
	[short_url_theme] [nvarchar](255) NULL,
 CONSTRAINT [PK__Tb_Theme__F949191F15DA3E5D] PRIMARY KEY CLUSTERED 
(
	[id_theme] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Tb_Theme] ON
INSERT [dbo].[Tb_Theme] ([id_theme], [descript_theme], [image_descript_theme], [name_theme], [short_url_theme]) VALUES (1, N'100 bài học từ vựng với hình ảnh đi kèm giúp học viên có thể học và nhớ 1000 từ vựng một cách dễ dàng và hiệu quả.', N'images/structure-1.jpg', N'1000 TỪ VỰNG THEO CHỦ ĐÊF', N'1000-tu-vung-theo-chu-de')
INSERT [dbo].[Tb_Theme] ([id_theme], [descript_theme], [image_descript_theme], [name_theme], [short_url_theme]) VALUES (2, N'Khóa học giúp bạn luyện tập cả 4 kỹ năng Nghe - Nói - Đọc - Viết qua 60 chủ đề giao tiếp thông dụng.', N'images/structure-2.jpg', N'TIẾNG ANH 
GIAO TIẾP', N'tieng-anh-giao-tiep')
INSERT [dbo].[Tb_Theme] ([id_theme], [descript_theme], [image_descript_theme], [name_theme], [short_url_theme]) VALUES (3, N'25 chủ điểm ngữ pháp cơ bản trong tiếng Anh giúp học viên lấy lại kiến thức ngữ pháp cơ bản nhanh chóng.', N'images/structure-3.jpg', N'NGỮ PHÁP 
CƠ BẢN', N'ngu-phap-co-ban')
INSERT [dbo].[Tb_Theme] ([id_theme], [descript_theme], [image_descript_theme], [name_theme], [short_url_theme]) VALUES (4, N'Hình thức học qua 498 video phim ảnh, ca nhạc,... tạo cho người học sự hứng khởi để tiếp thu kiến thức nhanh chóng.', N'images/structure-4.jpg', N'HỌC TIẾNG ANH 
QUA VIDEO', N'hoc-tieng-anh-qua-video')
SET IDENTITY_INSERT [dbo].[Tb_Theme] OFF
delete from Tb_Theme 
