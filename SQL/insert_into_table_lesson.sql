USE [LearnEnglish]
GO
/****** Object:  Table [dbo].[tb_lesson]    Script Date: 08/02/2019 20:46:52 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tb_lesson](
	[id_lesson] [int] IDENTITY(1,1) NOT NULL,
	[content] [nvarchar](255) NULL,
	[id_theme] [int] NOT NULL,
	[image_descript] [nvarchar](255) NULL,
	[short_descript] [nvarchar](255) NULL,
 CONSTRAINT [PK__tb_lesso__BC5E15A03493CFA7] PRIMARY KEY CLUSTERED 
(
	[id_lesson] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[tb_lesson] ON
INSERT [dbo].[tb_lesson] ([id_lesson], [content], [id_theme], [image_descript], [short_descript]) VALUES (1, N'Từ Vựng Tiếng Anh Dụng Cụ Học Tập', 1, N'tu-vung-chu-de-dung-cu-hoc-tap.jpg', NULL)
INSERT [dbo].[tb_lesson] ([id_lesson], [content], [id_theme], [image_descript], [short_descript]) VALUES (2, N'Từ Vựng Tiếng Anh Ngành Maketting', 1, N'tu-vung-chuyen-nganh-marketing.jpg', NULL)
INSERT [dbo].[tb_lesson] ([id_lesson], [content], [id_theme], [image_descript], [short_descript]) VALUES (3, N'Từ Vựng Nghành Y', 1, N'tu-vung-tieng-anh-nganh-y.jpg', NULL)
INSERT [dbo].[tb_lesson] ([id_lesson], [content], [id_theme], [image_descript], [short_descript]) VALUES (8, N'Từ Vựng Tiếng Anh Chủ Đề Thể Thao', 1, N'tu-vung-tieng-anh-the-thao.jpg', NULL)
INSERT [dbo].[tb_lesson] ([id_lesson], [content], [id_theme], [image_descript], [short_descript]) VALUES (9, N'Từ Vựng Tiếng Anh Chủ Đề Về Nhà Cửa', 1, N'tu-vung-tieng-anh-chu-de-nha-cua-1554794234.jpg', NULL)
INSERT [dbo].[tb_lesson] ([id_lesson], [content], [id_theme], [image_descript], [short_descript]) VALUES (11, N'Từ Vựng Tiếng Anh Chuyên Ngành Xuất Nhập Khẩu', 1, N'tu-vung-xuat-nhap-khau1-1550646606.jpg', NULL)
SET IDENTITY_INSERT [dbo].[tb_lesson] OFF
/****** Object:  ForeignKey [FKt0fnbm3xy7yxh299234kgqi8k]    Script Date: 08/02/2019 20:46:52 ******/
ALTER TABLE [dbo].[tb_lesson]  WITH CHECK ADD  CONSTRAINT [FKt0fnbm3xy7yxh299234kgqi8k] FOREIGN KEY([id_theme])
REFERENCES [dbo].[Tb_Theme] ([id_theme])
GO
ALTER TABLE [dbo].[tb_lesson] CHECK CONSTRAINT [FKt0fnbm3xy7yxh299234kgqi8k]
GO
